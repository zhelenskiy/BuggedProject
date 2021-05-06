class Impl(val some: Long): Interface {
    override fun someFun(other: Interface): Interface = when (other) {
        is Impl -> if (2+3<2) this else TODO()
    }
}