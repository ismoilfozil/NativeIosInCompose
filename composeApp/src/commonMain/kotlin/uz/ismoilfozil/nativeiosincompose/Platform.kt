package uz.ismoilfozil.nativeiosincompose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform