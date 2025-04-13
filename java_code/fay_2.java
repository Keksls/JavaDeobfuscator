/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fAY
 */
public class fay_2
extends fax_2 {
    private static final Logger d = Logger.getLogger(fay_2.class);
    private static final fay_2 e = new fay_2();

    private fay_2() {
    }

    public static fay_2 c() {
        return e;
    }

    @Override
    public void a() {
        d.info((Object)"[Xulor] Registering tags");
        this.a("focus", fbd_2.class);
        this.a("AnimatedElementViewer", frO.class);
        this.a("animatedLoadingViewer", frT.class);
        this.a("AnimatedImage", frR.class);
        this.a("basicColorPicker", fwd.class);
        this.a("Button", fru_0.class);
        this.a("calendar", fsb.class);
        this.a("colorPicker", fsi.class);
        this.a("rollingText", ftQ.class);
        this.a("ComboBoxPlus", fsk.class);
        this.a("ComboBox", fsk.class);
        this.a("compass", fsm_0.class);
        this.a("Container", fso.class);
        this.a("DisplayContainer", fsu.class);
        this.a("dndc", fsv_0.class);
        this.a("drawer", fsy_0.class);
        this.a("FlippingImage", fsd_0.class);
        this.a("FoldingContainer", fsf_0.class);
        this.a("graph", fsi_0.class);
        this.a("Image", fsk_0.class);
        this.a("Label", fsM.class);
        this.a("LayeredContainer", fsn_0.class);
        this.a("List", fsQ.class);
        this.a("MapNavigator", fsR.class);
        this.a("map", fsY.class);
        this.a("multipleImage", fte_0.class);
        this.a("MultiSelectionList", ftd_0.class);
        this.a("PopupMenu", fts_0.class);
        this.a("progressBar", ftv.class);
        this.a("progressText", ftF.class);
        this.a("RadioButton", ftI.class);
        this.a("renderableContainer", ftj_0.class);
        this.a("RepeatableImage", ftP.class);
        this.a("RootContainer", ftv_0.class);
        this.a("RadioGroup", fim_1.class);
        this.a("Separator", ful.class);
        this.a("Slider", fum.class);
        this.a("smiley", fuq_0.class);
        this.a("ScrollBar", ftx_0.class);
        this.a("ScrollContainer", fue_0.class);
        this.a("StackList", fus_0.class);
        this.a("spacer", fur_0.class);
        this.a("TabbedContainer", fut_0.class);
        this.a("TabItem", fin_1.class);
        this.a("table", fuc_0.class);
        this.a("tableColumn", fxs_0.class);
        this.a("TextEditor", fug_0.class);
        this.a("textEditorPlus", fuh_0.class);
        this.a("TextView", fuk_0.class);
        this.a("tintIntensityColorPicker", fwi.class);
        this.a("CheckBox", fup_0.class);
        this.a("ToggleButton", fup_0.class);
        this.a("tournament", fuS.class);
        this.a("tree", fuW.class);
        this.a("MRU", fvb_0.class);
        this.a("valueSelector", fvk.class);
        this.a("Video", fvp.class);
        this.a("WatcherContainer", fvc_0.class);
        this.a("wakfuBubble", fvy.class);
        this.a("immutableWakfuBubble", fsl_0.class);
        this.a("Window", fvk_0.class);
        this.a("MessageBox", fvk_0.class);
        this.a("WindowMovePoint", fvM.class);
        this.a("WMP", fvM.class);
        this.a("WindowResizePoint", fvp_0.class);
        this.a("WRP", fvp_0.class);
        this.a("bl", fih_2.class);
        this.a("BorderLayout", fih_2.class);
        this.a("bld", fii_2.class);
        this.a("borderLayoutData", fii_2.class);
        this.a("gl", fik_2.class);
        this.a("gld", fil_2.class);
        this.a("rl", fin_2.class);
        this.a("RowLayout", fin_2.class);
        this.a("rld", fip_2.class);
        this.a("Spring", fiq_2.class);
        this.a("SpringLayout", fiz_2.class);
        this.a("SPL", fiz_2.class);
        this.a("SpringLayoutData", fia_1.class);
        this.a("spld", fia_1.class);
        this.a("StaticLayout", fic_1.class);
        this.a("sl", fic_1.class);
        this.a("StaticLayoutData", fid_1.class);
        this.a("sld", fid_1.class);
        this.a("tl", fie_1.class);
        this.a("tld", fig_1.class);
        this.a("wl", fih_1.class);
        this.a("WrappableLayout", fih_1.class);
        this.a("AnimatedElementViewerAppearance", fqb.class);
        this.a("ButtonAppearance", fqd_0.class);
        this.a("ComboBoxAppearance", fqi.class);
        this.a("Appearance", fqj.class);
        this.a("PopupMenuAppearance", fqj.class);
        this.a("ScrollBarAppearance", fqj.class);
        this.a("ScrollContainerAppearance", fqj.class);
        this.a("SliderAppearance", fqj.class);
        this.a("WindowAppearance", fqj.class);
        this.a("appearanceContainer", fqc_0.class);
        this.a("ImageAppearance", fqp.class);
        this.a("mapAppearance", fqs.class);
        this.a("ListAppearance", fqr.class);
        this.a("progressBarAppearance", fqx.class);
        this.a("RadioButtonAppearance", fqb_0.class);
        this.a("TextWidgetAppearance", fqh_0.class);
        this.a("TextViewAppearance", fqh_0.class);
        this.a("LabelAppearance", fqh_0.class);
        this.a("TextEditorAppearance", fqF.class);
        this.a("textEditorPlusAppearance", fqG.class);
        this.a("ToggleButtonAppearance", fqj_0.class);
        this.a("FocusAppearance", faz_2.class);
        this.a("Color", fqg_0.class);
        this.a("NamedColor", fqg_0.class);
        this.a("Font", fqn.class);
        this.a("pixmap", fqv.class);
        this.a("Sound", fyl_0.class);
        this.a("border", fqk_0.class);
        this.a("margin", fqm_0.class);
        this.a("padding", fqo_0.class);
        this.a("BubbleBorder", fbt_1.class);
        this.a("GradientBackground", fbv_2.class);
        this.a("Particle", fbx_1.class);
        this.a("PixmapBackground", fby_2.class);
        this.a("PixmapBorder", fbc_1.class);
        this.a("pixmapBorder16", fbe_1.class);
        this.a("PlainBackground", fbf_1.class);
        this.a("PlainBorder", fbh_1.class);
        this.a("SwitchingPlainBackground", fbm_1.class);
        this.a("TiledPixmapBackground", fbn_1.class);
        this.a("data", fij_1.class);
        this.a("Form", fzz.class);
        this.a("ItemRenderer", faf_2.class);
        this.a("Item", fir_1.class);
        this.a("Property", fiy_1.class);
        this.a("ItemCondition", fav_1.class);
        this.a("ListCondition", faw_2.class);
        this.a("And", fan_2.class);
        this.a("Or", fae_2.class);
        this.a("Not", fay_1.class);
        this.a("Condition", far_2.class);
        this.a("isEqual", fat_2.class);
        this.a("isGreater", fam_1.class);
        this.a("isGreaterOrEqual", fan_1.class);
        this.a("isLess", fao_1.class);
        this.a("isLessOrEqual", fap_1.class);
        this.a("isNull", fac_1.class);
        this.a("isNotNull", fab_2.class);
        this.a("isNotEqual", faa_2.class);
        this.a("propertyExists", faf_1.class);
        this.a("isTrue", fai_1.class);
        this.a("isFalse", fau_1.class);
        this.a("StringCondition", fah_1.class);
        this.a("CollectionCondition", fap_2.class);
        this.a("ValueReplacer", fak_1.class);
        this.a("BitwiseOperation", fao_2.class);
        this.a("dialogLoaded", far_1.class);
        this.a("widgetAppearanceStateEquals", fav_2.class);
        this.a("hasState", fav_2.class);
        this.a("widgetAppearanceStateContains", fau_2.class);
        this.a("stateContains", fau_2.class);
        this.a("isEmpty", fas_2.class);
        this.a("isNotEmpty", faz_1.class);
        this.a("tooltip", fip_1.class);
        this.a("popup", fil_1.class);
    }
}

