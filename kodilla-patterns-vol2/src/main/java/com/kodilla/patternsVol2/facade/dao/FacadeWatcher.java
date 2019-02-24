package com.kodilla.patternsVol2.facade.dao;

import com.kodilla.patternsVol2.facade.api.OrderDto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FacadeWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);

    @Before("execution(* com.kodilla.patternsVol2.facade.api.OrderFacade.processOrder(..))" + "&&args(order,userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object){
        LOGGER.info("Class: " + object.getClass().getName() + " args: " + userId + ", " + order.getClass().getName());
    }
    @Around("execution(* com.kodilla.patternsVol2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object resultOrder;
        try {
            long beginOrder = System.currentTimeMillis();
            resultOrder = proceedingJoinPoint.proceed();
            long endOrder = System.currentTimeMillis();
            LOGGER.info("Time consumed: " + (endOrder - beginOrder) + "[ms]");
        } catch (Throwable throwable){
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
        return resultOrder;
    }
}

