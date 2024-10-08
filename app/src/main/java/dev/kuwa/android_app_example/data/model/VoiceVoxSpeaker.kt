package dev.kuwa.android_app_example.data.model

data class VoiceVoxSpeaker(
    val name: String,
    val speakerUuid: String,
    val styles: List<Style>,
    val version: String,
    val supportedFeatures: SupportedFeatures
)

data class Style(
    val name: String,
    val id: Int,
    val type: String
)

data class SupportedFeatures(
    val permittedSynthesisMorphing: String
)
