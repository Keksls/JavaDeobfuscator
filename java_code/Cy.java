/*
 * Decompiled with CFR 0.152.
 */
final class Cy
extends Cs {
    Cy(String string2) {
    }

    @Override
    public String b() {
        try {
            return Cr.p.call();
        }
        catch (Exception exception) {
            Cr.r.warn((Object)String.format("Following error occured during retrieval of %s with following callable %s", new Object[]{this, Cr.p}), (Throwable)exception);
            return "!" + this.a() + "!";
        }
    }
}

