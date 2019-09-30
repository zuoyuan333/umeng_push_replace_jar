# MakeJarDemo

    国内市场推送分了几大块: OV华米 各家有各家的推送。
    
    接到控制包大小的需求后将每个推送进行了空导包替换，实现了打包不改代码，在自行选择要打带哪个推送的包  

    oppo最近出了个广告sdk，也加入了。

    用例见MyApplication，实现了输出sdkVer的能力和输出厂商token的能力

    打包采用build.gradle多渠道打包的方式进行
        例

        apply plugin: 'com.android.application'
        android {

            // 编译使用的SDK版本
            compileSdkVersion rootProject.ext.compileSdkVersion
            // buildTools版本
            buildToolsVersion rootProject.ext.buildToolsVersion
            aaptOptions.cruncherEnabled = false
            aaptOptions.useNewCruncher = false
            defaultConfig {
                applicationId "com.zy"
                // 最小的SDK版本
                minSdkVersion 16
                // 目标SDK版本
                targetSdkVersion 21
                //用于支持65535以上方法数
                multiDexEnabled true
                versionCode rootProject.ext.versionCode
                versionName rootProject.ext.versionName
            }

            buildTypes {
                debug {//开发调试环境
                    minifyEnabled false
                    shrinkResources false
                }

                release {//正式环境
                    minifyEnabled true
                    shrinkResources true
                    zipAlignEnabled true
                    multiDexEnabled true
                }
            }
            applicationVariants.all { variant ->
                variant.outputs.all { output ->
                    def outputFile = output.outputFile
                    def buildTypeName = ""
                    def appName = "zy"
                    def fileName = ""
                    if (variant.buildType.name == "release") {
                        buildTypeName = "release"
                        fileName = "${variant.productFlavors[0].name}${variant.productFlavors[1].name}" + "_v${variant.versionName}_${variant.versionCode}_${gitVersion()}_${releaseTime()}_${buildTypeName}.apk"
                        outputFileName = fileName
                    }
                }
            }

            flavorDimensions("app", "manufacturer", "version")
            productFlavors {
                _normal {
                    dimension "manufacturer"
                }
                _xiaomi {
                    dimension "manufacturer"
                }
                _huawei {
                    dimension "manufacturer"
                }
                _oppo {
                    dimension "manufacturer"
                }
                _vivo {
                    dimension "manufacturer"
                }
                _all {
                    dimension "manufacturer"
                }

                main {
                   dimension "app"
                    applicationId "com.zy"
                    versionCode 1
                }
                _10000 {
                    dimension "version"
                    targetSdkVersion 26
                    versionName "1.0.000"
                }
            }
        }

        def gitVersion() {
            def gitVersion = 'git rev-parse --short HEAD'.execute().text.trim()
            def gitBranch = 'git symbolic-ref --short -q HEAD'.execute().text.trim()
            return 'GIT_'+gitBranch+"_"+gitVersion
        }

        def releaseTime() {
            return new Date().format("yyyyMMdd", TimeZone.getTimeZone("UTC"))
        }

        dependencies {
        //友盟推送----start
            //必须依赖基础组件库
            api 'com.umeng.umsdk:common:2.1.0'
            //PushSDK必须依赖utdid库，所以需要加入对应依赖
            api 'com.umeng.umsdk:utdid:1.1.5.3'
            //PushSDK
            api 'com.umeng.umsdk:push:6.0.1'
            /*都不要*/
            _normalApi files('libs/umeng_xiaomi_push_no_op.jar')
            _normalApi files('libs/umeng_huawei_push_no_op.jar')
            _normalApi files('libs/umeng_oppo_push_no_op.jar')
            _normalApi files('libs/umeng_vivo_push_no_op.jar')
            //只要华为
            _huaweiApi files('libs/umeng_xiaomi_push_no_op.jar')
            _huaweiApi files('libs/umeng_vivo_push_no_op.jar')
            _huaweiApi files('libs/umeng_oppo_push_no_op.jar')
            _huaweiApi 'com.umeng.umsdk:huawei-basetb:2.6.3.305'
            _huaweiApi 'com.umeng.umsdk:huawei-pushtb:2.6.3.305'
            _huaweiApi 'com.umeng.umsdk:huawei-umengaccs:1.2.1'
            //只要小米
            _xiaomiApi files('libs/umeng_huawei_push_no_op.jar')
            _xiaomiApi files('libs/umeng_oppo_push_no_op.jar')
            _xiaomiApi files('libs/umeng_vivo_push_no_op.jar')
            _xiaomiApi 'com.umeng.umsdk:xiaomi-push:3.6.9'
            _xiaomiApi 'com.umeng.umsdk:xiaomi-umengaccs:1.1.0'
            //只要oppo
            _oppoApi files('libs/umeng_huawei_push_no_op.jar')
            _oppoApi files('libs/umeng_xiaomi_push_no_op.jar')
            _oppoApi files('libs/umeng_vivo_push_no_op.jar')
            _oppoApi 'com.umeng.umsdk:oppo-push:1.0.1'
            _oppoApi 'com.umeng.umsdk:oppo-umengaccs:1.0.3'
            //只要vivo
            _vivoApi files('libs/umeng_huawei_push_no_op.jar')
            _vivoApi files('libs/umeng_oppo_push_no_op.jar')
            _vivoApi files('libs/umeng_xiaomi_push_no_op.jar')
            _vivoApi 'com.umeng.umsdk:vivo-push:2.3.1'
            _vivoApi 'com.umeng.umsdk:vivo-umengaccs:1.0.4'
            /*OV华米*/
            _allApi 'com.umeng.umsdk:xiaomi-push:3.6.9'
            _allApi 'com.umeng.umsdk:xiaomi-umengaccs:1.1.0'
            _allApi 'com.umeng.umsdk:huawei-basetb:2.6.3.305'
            _allApi 'com.umeng.umsdk:huawei-pushtb:2.6.3.305'
            _allApi 'com.umeng.umsdk:huawei-umengaccs:1.2.1'
            _allApi 'com.umeng.umsdk:huawei-umengaccs:1.2.1'
            _allApi 'com.umeng.umsdk:vivo-push:2.3.1'
            _allApi 'com.umeng.umsdk:vivo-umengaccs:1.0.4'
            _allApi 'com.umeng.umsdk:oppo-push:1.0.1'
            _allApi 'com.umeng.umsdk:oppo-umengaccs:1.0.3'
            //友盟推送----end

        }



