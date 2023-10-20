/*
 * Tencent is pleased to support the open source community by making tRPC available.
 *
 * Copyright (C) 2023 THL A29 Limited, a Tencent company. 
 * All rights reserved.
 *
 * If you have downloaded a copy of the tRPC source code from Tencent,
 * please note that tRPC source code is licensed under the Apache 2.0 License,
 * A copy of the Apache 2.0 License can be found in the LICENSE file.
 */

package com.tencent.trpc.integration.test.stub;

import com.tencent.trpc.core.rpc.RpcContext;
import com.tencent.trpc.core.rpc.anno.TRpcMethod;
import com.tencent.trpc.core.rpc.anno.TRpcService;
import java.util.concurrent.CompletionStage;
import com.tencent.trpc.integration.test.stub.EchoService.EchoRequest;
import com.tencent.trpc.integration.test.stub.EchoService.EchoResponse;
import com.tencent.trpc.integration.test.stub.EchoService.DelayedEchoRequest;

/**
 * Generated by trpc-java-codegen
 */
@TRpcService(name = "com.tencent.trpc.integration.test.Echo")
public interface EchoAsyncAPI {

    @TRpcMethod(name = "echo")
    CompletionStage<EchoResponse> echo(RpcContext context, EchoRequest request);

    @TRpcMethod(name = "delayedEcho")
    CompletionStage<EchoResponse> delayedEcho(RpcContext context, DelayedEchoRequest request);
}