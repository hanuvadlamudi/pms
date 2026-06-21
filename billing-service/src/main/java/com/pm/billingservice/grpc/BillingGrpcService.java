package com.pm.billingservice.grpc;


import billing.BillingRequest;
import billing.BillingResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import billing.BillingServiceGrpc.BillingServiceImplBase;

@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {
     @Override
    public void createBillingAccount(BillingRequest billingRequest,
                                     StreamObserver<BillingResponse> responseObserver){
         //Business Logic
         BillingResponse response = BillingResponse.newBuilder()
                 .setAccountId("123456")
                 .setStatus("Active")
                 .build();

         responseObserver.onNext(response);
         responseObserver.onCompleted();
     }
}
