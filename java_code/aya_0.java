/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aYA
 */
public final class aya_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    private final int c;
    private final String[] d;

    public aya_0(int n, String ... stringArray) {
        this.d = (String[])stringArray.clone();
        this.c = n;
    }

    @Override
    public boolean a() {
        switch (this.c) {
            case 0: 
            case 1: {
                return this.d.length == 0;
            }
        }
        return false;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        try {
            switch (this.c) {
                case 0: {
                    this.c();
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution d'une commande de spellXp (client) " + exception);
        }
    }

    private void c() {
        aya_0.a("spellXp (help | h) : display commands descriptions");
        aya_0.a("spellXp (total | t) : display total spell xp for each hero");
    }
}

