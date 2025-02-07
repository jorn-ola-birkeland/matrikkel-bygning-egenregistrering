package no.kartverket.matrikkel.bygning.plugins

import io.bkbn.kompendium.core.plugin.NotarizedApplication
import io.bkbn.kompendium.json.schema.KotlinXSchemaConfigurator
import io.bkbn.kompendium.oas.OpenApiSpec
import io.bkbn.kompendium.oas.info.Info
import io.ktor.server.application.*

fun Application.configureOpenAPI() {
    install(NotarizedApplication()) {
        spec = OpenApiSpec(
            jsonSchemaDialect = "https://spec.openapis.org/oas/3.1/dialect/base",
            info = Info(
                title = "API For Egenregistrering av Bygningsdata",
                version = "0.1",
            ),
        )
        schemaConfigurator = KotlinXSchemaConfigurator()
    }
}
