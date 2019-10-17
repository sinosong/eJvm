package com.brilliance.ejvm.dao.impl;

import com.brilliance.ejvm.dao.IExecuteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author sinosong
 */
@Service("defaultExecuteService")
public class ExecuteServiceImpl implements IExecuteService {

    protected static  final Logger logger = LogManager.getLogger();

    @Autowired
    private PlatformTransactionManager txManager;

    @Override
    public void execute() {

        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        def.setIsolationLevel(TransactionDefinition.ISOLATION_READ_COMMITTED);
        TransactionStatus status = txManager.getTransaction(def);

        try {

            System.out.println("execute......");


            txManager.commit(status);

        } catch (Exception e) {
            txManager.rollback(status);
            e.printStackTrace();
        } finally {
            System.out.println("end......");
        }

    }
}
