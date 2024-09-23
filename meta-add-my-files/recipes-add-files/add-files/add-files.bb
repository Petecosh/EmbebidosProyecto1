DESCRIPTION = "File Installer"
LICENSE = "CLOSED"

SRC_URI = " \
    file://best.onnx \
    file://Rocas_Prueba.jpg \
    file://VideoRocasPrueba.mp4 \
    file://RockDetect_ONNX_Imagen.py \
    file://RockDetect_ONNX_Video.py \
"

S = "${WORKDIR}"

do_install() {
    install -d ${D}/app
    install ${S}/best.onnx ${D}/app
    install ${S}/Rocas_Prueba.jpg ${D}/app
    install ${S}/VideoRocasPrueba.mp4 ${D}/app
    install ${S}/RockDetect_ONNX_Imagen.py ${D}/app
    install ${S}/RockDetect_ONNX_Video.py ${D}/app
}

FILES:${PN} += "/app"
