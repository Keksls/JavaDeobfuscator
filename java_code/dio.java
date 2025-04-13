/*
 * Decompiled with CFR 0.152.
 */
final class dio {
    private final String b;
    private final akx_2 c;
    private final akr_2[] d;

    dio(String string, akx_2 akx_22, akr_2[] akr_2Array) {
        assert (akx_22 != null) : "BubbleClosedListener avec un script null";
        assert (string != null) : "BubbleClosedListener avec une fonction nulle";
        this.b = string;
        this.d = akr_2Array;
        this.c = akx_22;
    }

    public void a() {
        this.c.a(this.b, this.d, new akq_1[0]);
    }
}

