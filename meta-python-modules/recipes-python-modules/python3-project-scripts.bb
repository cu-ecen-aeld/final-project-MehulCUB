# See http://git.yoctoproject.org/cgit.cgi/poky/tree/meta/files/common-licenses
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# TODO: Set this  with the path to your assignments rep.  Use ssh protocol and see lecture notes
# about how to setup ssh-agent for passwordless access
SRC_URI = "git://git@github.com/cu-ecen-aeld/final-project-support-bjorn-mehul;protocol=ssh;branch=main"

PV = "1.0+git${SRCPV}"

# TODO: set to reference a specific commit hash in your assignment repo
SRCREV = "${AUTOREV}"

# This sets your staging directory based on WORKDIR, where WORKDIR is defined at 
# https://www.yoctoproject.org/docs/latest/ref-manual/ref-manual.html#var-WORKDIR

# We reference the "server" directory here to build from the "server" directory
# in your assignments repo
S = "${WORKDIR}/git"

do_install_append () {
    install -d ${D}${bindir}
    install -m 0755 bme_python/read_bme280.py ${D}${bindir}
    install -m 0755 mqtt_scripts/main_server.py ${D}${bindir}
}
