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

class djS
extends akk_2 {
    djS(LuaState luaState) {
        super(luaState);
    }

    @Override
    public String a() {
        return "hasShortcut";
    }

    @Override
    @Nullable
    public akf_1[] e() {
        return dir_0.an;
    }

    @Override
    public String b() {
        return "Indique si le joueur a au moins un raccourci";
    }

    @Override
    public final akf_1[] f() {
        return dir_0.am;
    }

    @Override
    protected void a(int n) {
        bmr_1 bmr_12;
        bOw bOw2;
        ArrayList<bOv> arrayList;
        int n2 = -1;
        fie fie2 = null;
        if (n == 2) {
            n2 = this.d(0);
            fie2 = fie.a((byte)this.d(1));
        }
        if (this.a(n2, fie2, arrayList = (bOw2 = (bmr_12 = azu_0.j().k()).cg()).d(false))) {
            return;
        }
        ArrayList<bOv> arrayList2 = bOw2.c(false);
        if (this.a(n2, fie2, arrayList2)) {
            return;
        }
        this.a(false);
    }

    private boolean a(int n, fie fie2, ArrayList<bOv> arrayList) {
        for (int k = arrayList.size() - 1; k >= 0; --k) {
            bOv bOv2 = arrayList.get(k);
            if (n != -1) {
                for (boq_0 boq_02 : bOv2.a(n)) {
                    if (boq_02.n() != fie2) continue;
                    this.a(true);
                    return true;
                }
                continue;
            }
            if (bOv2.l()) continue;
            this.a(true);
            return true;
        }
        return false;
    }
}

