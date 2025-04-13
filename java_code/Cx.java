/*
 * Decompiled with CFR 0.152.
 */
final class Cx
extends Cs {
    Cx(String string2) {
    }

    @Override
    public String b() {
        try {
            return Cr.o.call();
        }
        catch (Exception exception) {
            Cr.r.warn((Object)String.format("Following error occured during retrieval of %s with following callable %s", new Object[]{this, Cr.o}), (Throwable)exception);
            return "!" + this.a() + "!";
        }
    }
}

