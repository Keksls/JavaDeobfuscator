/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fwa
 */
public class fwa_0
extends fvx_0 {
    private static final String b = "gray";
    private static final String c = "chatThinkingBubble";
    private static final String d = "BubbleThinkingArrowLeft";
    private static final String e = "BubbleThinkingArrowRight";

    @Override
    public void a(fvy fvy2) {
        super.a(fvy2);
        this.a(b);
        this.a(c, new fjf_2(30, 40));
        this.a(fvy2.isToRight() ? d : e, fvy2.isToRight() ? 25 : -25, 5);
        fvy2.setXOffset(fvy2.isToRight() ? -5 : 5);
    }
}

