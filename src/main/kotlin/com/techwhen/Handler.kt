package com.techwhen

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.apache.log4j.Logger
import java.time.Instant
import java.util.*


class Handler : RequestHandler<Map<String, Any>, ApiGatewayResponse> {

    override fun handleRequest(input: Map<String, Any>, context: Context): ApiGatewayResponse {
        LOG.info("This is what I got: $input")

        val conference = Conference("KotlinConf",
                "Melbourne",
                "kotlinconf.com.au",
                Date(Instant.now().toEpochMilli()),
                Date(Instant.now().toEpochMilli()))
        val mapper = jacksonObjectMapper()

        val headers = HashMap<String, String>()
        headers["X-Powered-By"] = "AWS Lambda & Serverless"
        headers["Content-Type"] = "application/json"
        return ApiGatewayResponse(
                200,
                mapper.writeValueAsString(conference),
                headers,
                true)
    }

    companion object {
        private val LOG = Logger.getLogger(Handler::class.java)
    }
}