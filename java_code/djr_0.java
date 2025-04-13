/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.keplerproject.luajava.LuaState
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.keplerproject.luajava.LuaState;

/*
 * Renamed from djR
 */
class djr_0
extends akk_2 {
    djr_0(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "hasFightShortcut";
    }

    @Override
    public String b() {
        return "Indique si le joueur a au moins un raccourci de combat";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return dir_0.ar;
    }

    @Override
    public final akf_1[] f() {
        return dir_0.aq;
    }

    @Override
    protected void a(int n) {
        int n2 = -1;
        fie fie2 = null;
        if (n == 2) {
            n2 = this.d(0);
            fie2 = fie.a((byte)this.d(1));
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bOw bOw2 = bmr_12.cg();
        ArrayList<bOv> arrayList = bOw2.c(false);
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            bOv bOv2 = arrayList.get(k);
            if (n2 != -1) {
                for (boq_0 boq_02 : bOv2.a(n2)) {
                    if (boq_02.n() != fie2) continue;
                    this.a(true);
                    return;
                }
                continue;
            }
            if (bOv2.l()) continue;
            this.a(true);
            return;
        }
        this.a(false);
    }
}

