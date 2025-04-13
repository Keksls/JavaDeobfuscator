/*
 * Decompiled with CFR 0.152.
 */
public class fvZ
extends fvx_0 {
    private static final String b = "DefaultDark14";
    private static final String c = "chatBubble";
    private static final String d = "BubbleArrowLeft";
    private static final String e = "BubbleArrowRight";

    @Override
    public void a(fvy fvy2) {
        super.a(fvy2);
        this.a(b);
        this.a(c, new fjf_2(12, 20));
        this.a(fvy2.isToRight() ? d : e, fvy2.isToRight() ? 15 : -15, 0);
        fvy2.setXOffset(fvy2.isToRight() ? -5 : 5);
    }
}

