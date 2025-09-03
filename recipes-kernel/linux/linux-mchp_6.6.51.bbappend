FILESEXTRAPATHS:prepend := "${THISDIR}/linux-mchp/sam9x60:"
SRC_URI:append:sam9x60 = " \
    file://0001-sam9x60-update-device-tree-for-LCD-Touch.patch \
    file://fragment.cfg \
"
