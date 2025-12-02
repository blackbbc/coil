package coil3

import coil3.decode.OhosImageDecoder

internal actual fun ComponentRegistry.Builder.addAppleComponents(
    options: RealImageLoader.Options,
): ComponentRegistry.Builder {
    return this.add(OhosImageDecoder.Factory())
}
