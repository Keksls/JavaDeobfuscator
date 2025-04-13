/*
 * Decompiled with CFR 0.152.
 */
public class dep {
    private final fvk_0 a;
    private final fzu b;

    public dep(fvk_0 fvk_02, aUv aUv2) {
        this.a = fvk_02;
        this.b = new deq(this, aUv2);
        this.a.setEnableResizeEvents(true);
        this.a.addEventListener(frd_0.P, this.b, true);
    }

    public fvk_0 a() {
        return this.a;
    }

    public void b() {
        this.a.removeEventListener(frd_0.P, this.b, true);
    }
}

