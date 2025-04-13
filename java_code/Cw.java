/*
 * Decompiled with CFR 0.152.
 */
final class Cw
extends Cs {
    Cw(String string2) {
    }

    @Override
    public String b() {
        try {
            return Cr.n.call();
        }
        catch (Exception exception) {
            Cr.r.warn((Object)String.format("Following error occured during retrieval of %s with following callable %s", new Object[]{this, Cr.n}), (Throwable)exception);
            return "!" + this.a() + "!";
        }
    }
}

