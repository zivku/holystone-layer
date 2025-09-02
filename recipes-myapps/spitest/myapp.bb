SUMMARY = "Test file copy to rootfs"
LICENSE = "CLOSED"
SRC_URI = "file://spp"

ROOT_HOME = "/root"

do_install() {
    install -D -m 0755 --target-directory=${D}${ROOT_HOME} ${WORKDIR}/spp
}

FILES:${PN} += "${ROOT_HOME}"

COMPATIBLE_MACHINE = "(at91sam9|sama5)"

