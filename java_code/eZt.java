/*
 * Decompiled with CFR 0.152.
 */
public class eZt
extends eZw {
    @Override
    public boolean a() {
        return false;
    }

    @Override
    public boolean a(byte by, int n) {
        return false;
    }

    @Override
    public boolean b(byte by, int n) {
        throw new eyp_1("Impossible d'equiper une gemme sur un ImmutableShards");
    }

    @Override
    public int a(byte by) {
        throw new eyp_1("Impossible de retirer une gemme sur un ImmutableShards");
    }
}

