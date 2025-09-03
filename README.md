# Yocto環境建立
1. 下載依賴項 :
```
sudo apt install chrpath zstd
```
```
sudo apt install git-lfs
```
2. 下載poky :
```
git clone https://git.yoctoproject.org/poky && cd poky && git checkout -b scarthgap scarthgap-5.0.3 && cd –
```
3. 下載通用軟體包 :
```
git clone git://git.openembedded.org/meta-openembedded && cd meta-openembedded && git checkout -b scarthgap 735ae0 && cd -
```
4. 下載microchip layer :
```
git clone https://github.com/linux4sam/meta-atmel.git && cd meta-atmel && git checkout linux4microchip+sama7d65-2025.02 && cd -
```
5. 下載ARM layer :
```
git clone https://git.yoctoproject.org/meta-arm && cd meta-arm && git checkout -b scarthgap yocto-5.0 && cd –
```
6. 下載holystone layer :
```
git clone https://github.com/zivku/meta-holystone.git
```
7. 建立環境與設定 :
```
cd poky
```
```
mkdir build-microchip
```
```
export TEMPLATECONF=${TEMPLATECONF:-../meta-atmel/conf/templates/default}
```
```
source oe-init-build-env build-microchip
```
```
MACHINE=sam9x60-curiosity bitbake-layers add-layer ../../meta-holystone
```
7. 編譯燒錄映像 :
```
MACHINE=sam9x60-curiosity bitbake microchip-graphics-image
```
