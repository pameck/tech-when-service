package com.techwhen

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.apache.log4j.Logger
import java.util.*


class Handler : RequestHandler<Map<String, Any>, ApiGatewayResponse> {

    override fun handleRequest(input: Map<String, Any>, context: Context): ApiGatewayResponse {
        LOG.info("sdhfjkshdkfjdhsfklshfkljsh: $input")


        val headers = HashMap<String, String>()
        headers["X-Powered-By"] = "AWS Lambda & Serverless"
        headers["Content-Type"] = "application/json"
        return ApiGatewayResponse(
                200,
                """
                | { "message": "Hello Chloe" }
                """.trimMargin(),
                headers,
                true)
    }

    companion object {
        private val LOG = Logger.getLogger(Handler::class.java)
    }
}