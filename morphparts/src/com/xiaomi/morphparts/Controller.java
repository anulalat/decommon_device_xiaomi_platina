package com.xiaomi.morphparts;

public interface Controller {

    // Audio Gain
    String PREF_HEADPHONE_GAIN = "headphone_gain";
    String PREF_MICROPHONE_GAIN = "microphone_gain";
    String HIGH_PERF_AUDIO = "highperfaudio";

    String HEADPHONE_GAIN_PATH = "/sys/kernel/sound_control/headphone_gain";
    String MICROPHONE_GAIN_PATH = "/sys/kernel/sound_control/mic_gain";
    String HIGH_AUDIO_PATH = "/sys/module/wcd9335_dlkm/parameters/huwifi_mode";

    String PREF_TCP = "tcpcongestion";
    String TCP_SYSTEM_PROPERTY = "persist.tcp.profile";

    String PREF_ENABLE_HAL3 = "hal3";
    String HAL3_SYSTEM_PROPERTY = "persist.camera.HAL3.enabled";

    String PREF_CPUBOOST = "cpuboost";
    String CPUBOOST_SYSTEM_PROPERTY = "persist.cpuboost.profile";

    String PREF_GPUBOOST = "gpuboost";
    String GPUBOOST_SYSTEM_PROPERTY = "persist.gpuboost.profile";

    String PREF_EARPIECE_GAIN = "earpiece_gain";
    String EARPIECE_GAIN_PATH = "/sys/kernel/sound_control/earpiece_gain";

    String CATEGORY_FASTCHARGE = "usb_fastcharge";
    String PREF_USB_FASTCHARGE = "fastcharge";
    String USB_FASTCHARGE_PATH = "/sys/kernel/fast_charge/force_fast_charge";

    String CATEGORY_TOUCHBOOST = "msm_touchboost";
    String PREF_MSM_TOUCHBOOST = "touchboost";
    String MSM_TOUCHBOOST_PATH = "/sys/module/msm_performance/parameters/touchboost";

    String PREF_SPEAKER_GAIN = "speaker_gain";
    String SPEAKER_GAIN_PATH = "/sys/kernel/sound_control/speaker_gain";

    String PREF_LKM = "lkmprofile";
    String LKM_SYSTEM_PROPERTY = "persist.lkm.profile";

    String PERF_MSM_THERMAL = "msmthermal";
    String MSM_THERMAL_PATH = "/sys/module/msm_thermal/parameters/enabled";
    String PERF_CORE_CONTROL = "corecontrol";
    String CORE_CONTROL_PATH = "/sys/module/msm_thermal/core_control/enabled";
    String PERF_VDD_RESTRICTION = "vddrestrict";
    String VDD_RESTRICTION_PATH = "/sys/module/msm_thermal/vdd_restriction/enabled";
    String PREF_CPUCORE = "cpucore";
    String CPUCORE_SYSTEM_PROPERTY = "persist.cpucore.profile";

    // Dirac
    String PREF_ENABLE_DIRAC = "dirac_enabled";
    String PREF_HEADSET = "dirac_headset_pref";
    String PREF_PRESET = "dirac_preset_pref";

    // Dimmer
    String PREF_BACKLIGHT_DIMMER = "backlight_dimmer";
    String BACKLIGHT_DIMMER_PATH = "/sys/module/mdss_fb/parameters/backlight_dimmer";

    // FPS info
    String PREF_KEY_FPS_INFO = "fps_info";
    String MEASURED_FPS = "/sys/class/drm/sde-crtc-0/measured_fps";

    // Kcal
    String PREF_DEVICE_KCAL = "device_kcal";
    String PREF_ENABLED = "kcal_enabled";
    String PREF_SETONBOOT = "set_on_boot";
    String PREF_MINIMUM = "color_minimum";
    String PREF_RED = "color_red";
    String PREF_GREEN = "color_green";
    String PREF_BLUE = "color_blue";
    String PREF_SATURATION = "saturation";
    String PREF_VALUE = "value";
    String PREF_CONTRAST = "contrast";
    String PREF_HUE = "hue";
    String PREF_GRAYSCALE = "grayscale";

    boolean SETONBOOT_DEFAULT = false;
    int MINIMUM_DEFAULT = 35;
    int RED_DEFAULT = 255;
    int GREEN_DEFAULT = 255;
    int BLUE_DEFAULT = 255;
    int SATURATION_DEFAULT = 35;
    int SATURATION_OFFSET = 225;
    int VALUE_DEFAULT = 127;
    int VALUE_OFFSET = 128;
    int CONTRAST_DEFAULT = 127;
    int CONTRAST_OFFSET = 128;
    int HUE_DEFAULT = 0;
    boolean GRAYSCALE_DEFAULT = false;

    String KCAL_ENABLE = "/sys/devices/platform/kcal_ctrl.0/kcal_enable";
    String KCAL_CONT = "/sys/devices/platform/kcal_ctrl.0/kcal_cont";
    String KCAL_HUE = "/sys/devices/platform/kcal_ctrl.0/kcal_hue";
    String KCAL_MIN = "/sys/devices/platform/kcal_ctrl.0/kcal_min";
    String KCAL_RGB = "/sys/devices/platform/kcal_ctrl.0/kcal";
    String KCAL_SAT = "/sys/devices/platform/kcal_ctrl.0/kcal_sat";
    String KCAL_VAL = "/sys/devices/platform/kcal_ctrl.0/kcal_val";

    // Selinux
    String SELINUX_CATEGORY = "selinux";
    String SELINUX_EXPLANATION = "selinux_explanation";
    String PREF_SELINUX_MODE = "selinux_mode";
    String PREF_SELINUX_PERSISTENCE = "selinux_persistence";

    // Torch
    String TORCH_KEY = "torch";
    String PERF_YELLOW_TORCH_BRIGHTNESS = "yellow_torch_brightness";
    String PERF_WHITE_TORCH_BRIGHTNESS = "white_torch_brightness";

    String TORCH_YELLOW_BRIGHTNESS_PATH = "/sys/devices/soc/200f000.qcom," +
            "spmi/spmi-0/spmi0-03/200f000.qcom,spmi:qcom,pmi8950@3:qcom,leds@d300/leds/led:torch_0/max_brightness";
    String TORCH_WHITE_BRIGHTNESS_PATH = "/sys/devices/soc/200f000.qcom," +
            "spmi/spmi-0/spmi0-03/200f000.qcom,spmi:qcom,pmi8950@3:qcom,leds@d300/leds/led:torch_1/max_brightness";

    // Vibrate
    String VIBRATION_KEY = "vtg";
    String PREF_VIBRATION_SYSTEM_STRENGTH = "vibration_system";
    String PREF_VIBRATION_NOTIFICATION_STRENGTH = "vibration_notification";
    String PREF_VIBRATION_CALL_STRENGTH = "vibration_call";

    String VIBRATION_SYSTEM_PATH = "/sys/class/leds/vibrator/vmax_mv_user";
    String VIBRATION_NOTIFICATION_PATH = "/sys/class/leds/vibrator/vmax_mv_strong";
    String VIBRATION_CALL_PATH = "/sys/class/leds/vibrator/vmax_mv_call";

    int MIN_VIBRATION = 116;
    int MAX_VIBRATION = 3596;
}
