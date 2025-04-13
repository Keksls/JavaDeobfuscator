/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fyv
 */
public abstract class fyv_0
extends fyo {
    @Override
    public void addFromXML(fyb_0 fyb_02) {
        this.getParentOfType(fyb_0.class).addFromXML(fyb_02);
    }

    @Override
    public void add(fyb_0 fyb_02) {
        this.getParentOfType(fyb_0.class).add(fyb_02);
    }

    @Override
    public fyz getElementType() {
        return fyz.b;
    }
}

