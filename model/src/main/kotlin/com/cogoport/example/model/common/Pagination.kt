package com.cogoport.example.model.common

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.Positive

@Introspected
open class Pagination() {
    @JsonProperty("pageSize")
    @Positive(message = "Index must be positive digit") var pageSize: Int? = 10

    @JsonProperty("pageIndex")
    @Positive(message = "Index must be positive digit") var pageIndex: Int? = 1
}
