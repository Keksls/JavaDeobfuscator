/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ef
 */
public final class ef_0 {
    private ef_0() {
    }

    public static ft_0 a(eg_1 eg_12) {
        ft_0 ft_02 = new ft_0();
        ft_02.a(eg_12.b());
        byte by = eg_12.a();
        if ((by & 1) == 1) {
            if ((by & 0x20) == 32) {
                ft_02.a((float)eg_12.a() / 127.0f);
                ft_02.b((float)eg_12.a() / 127.0f);
                ft_02.c((float)eg_12.a() / 127.0f);
                ft_02.d((float)eg_12.a() / 127.0f);
            } else {
                ft_02.a((float)eg_12.b() / 256.0f);
                ft_02.b((float)eg_12.b() / 256.0f);
                ft_02.c((float)eg_12.b() / 256.0f);
                ft_02.d((float)eg_12.b() / 256.0f);
            }
        }
        if ((by & 2) == 2) {
            if ((by & 0xFFFFFF80) == -128) {
                ft_02.e((float)eg_12.a() * 16.0f / 127.0f);
                ft_02.f((float)eg_12.a() * 16.0f / 127.0f);
            } else if ((by & 0x40) == 64) {
                ft_02.e((float)eg_12.b() / 256.0f);
                ft_02.f((float)eg_12.b() / 256.0f);
            } else {
                ft_02.e(eg_12.d());
                ft_02.f(eg_12.d());
            }
        }
        if ((by & 4) == 4) {
            ft_02.g((float)eg_12.b() / 256.0f);
            ft_02.h((float)eg_12.b() / 256.0f);
            ft_02.i((float)eg_12.b() / 256.0f);
            ft_02.j((float)eg_12.b() / 256.0f);
        }
        if ((by & 8) == 8) {
            ft_02.k((float)eg_12.a() / 127.0f);
            ft_02.l((float)eg_12.a() / 127.0f);
            ft_02.m((float)eg_12.a() / 127.0f);
            ft_02.n((float)eg_12.a() / 127.0f);
        }
        return ft_02;
    }
}

