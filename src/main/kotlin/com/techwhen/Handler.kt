package com.techwhen

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.apache.log4j.Logger

class Handler : RequestHandler<Map<String, Any>, ApiGatewayResponse> {

    override fun handleRequest(input: Map<String, Any>, context: Context): ApiGatewayResponse {
        LOG.info("This is what I got: $input")

        val conferences = ConferenceRepository.findAll()

        val headers = HashMap<String, String>()
        headers["Content-Type"] = "application/json"
        headers["Access-Control-Allow-Origin"] = "*"
        headers["Access-Control-Allow-Credentials"] = "true"

        return ApiGatewayResponse(
                200,
                jacksonObjectMapper().writeValueAsString(conferences),
                headers,
                true)
    }

    companion object {
        private val LOG = Logger.getLogger(Handler::class.java)
    }
}