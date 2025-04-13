/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from bUi
 */
public class bui_0
extends faw_0 {
    private final ArrayList<buj_0> d = new ArrayList();
    private final buj_0 e = new buj_0(34);

    @Override
    public boolean a(byte by) {
        if (super.a(by)) {
            this.d.add(new buj_0(by));
            Collections.sort(this.d);
            return true;
        }
        return false;
    }

    public ArrayList<buj_0> a() {
        return this.d;
    }

    public buj_0 b() {
        return this.e;
    }

    @Override
    public void c() {
        super.c();
        this.d.clear();
    }

    @Override
    public void a(qr_2 qr_22) {
        throw new UnsupportedOperationException("Pas de serialisation de landmarks dans le client");
    }
}

