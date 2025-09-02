DESCRIPTION = "Init demo"
LICENSE = "CLOSED"

SRC_URI = "file://wifi-auto.service"

RDEPENDS:${PN} = "udev-rules-at91"

PR = "r2"

do_install() {
	install -d ${D}${systemd_unitdir}/system
	install -m 0644 ${WORKDIR}/wifi-auto.service ${D}${systemd_unitdir}/system/
}

inherit allarch systemd
FILES:${PN} += "${systemd_unitdir}/system/"

SYSTEMD_SERVICE:${PN} = "wifi-auto.service"
