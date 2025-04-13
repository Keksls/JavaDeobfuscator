/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public class Vs<Rated extends Vk>
implements Vr<Rated> {
    public static final int a = 1000;
    public static final int b = 2000;
    private int c = 1000;
    private int d = 2000;

    @Override
    public void a(int n) {
        this.c = n;
    }

    @Override
    public void b(int n) {
        this.d = n;
    }

    @Override
    public int a() {
        return this.c;
    }

    @Override
    public int b() {
        return this.d;
    }

    private int c(int n) {
        if (n < 1400) {
            return 48;
        }
        if (n < 1600) {
            return 36;
        }
        return 24;
    }

    private double a(int n, int n2) {
        return 1.0 / (1.0 + Math.pow(10.0, (double)(n2 - n) / 400.0));
    }

    @Override
    public void a(@NotNull Vm<Rated> vm) {
        Vk[] vkArray = vm.a();
        double[] dArray = new double[2];
        double d2 = vm.e() == vkArray[0] ? 1.0 : (dArray[0] = vm.d() ? 0.5 : 0.0);
        dArray[1] = vm.e() == vkArray[1] ? 1.0 : (vm.d() ? 0.5 : 0.0);
        double[] dArray2 = dArray;
        int n = vkArray[0].b();
        int n2 = vkArray[1].b();
        int n3 = this.c(n) < this.c(n2) ? this.c(n) : this.c(n2);
        int n4 = n + (int)Math.round((double)n3 * (dArray2[0] - this.a(n, n2)));
        int n5 = n4 > this.c ? n4 : this.c;
        vkArray[0].a(n5 < this.d ? n5 : this.d);
        n4 = n2 + (int)Math.round((double)n3 * (dArray2[1] - this.a(n2, n)));
        n5 = n4 > this.c ? n4 : this.c;
        vkArray[1].a(n5 < this.d ? n5 : this.d);
    }

    @Override
    public void a(Vq<Rated> vq) {
        int n;
        int n2;
        double[] dArray;
        Collection<Rated> collection;
        Collection<Rated> collection2;
        if (vq.f()) {
            collection2 = vq.a();
            collection = vq.b();
            dArray = new double[]{0.5, 0.5};
        } else {
            collection2 = vq.i();
            collection = vq.j();
            dArray = new double[]{1.0, 0.0};
        }
        int n3 = 0;
        for (Object object : collection2) {
            n3 += object.b();
        }
        n3 /= collection2.size();
        int n4 = 0;
        for (Iterator<Rated> iterator : collection) {
            n4 += iterator.b();
        }
        int n5 = this.c(n3) < this.c(n4 /= collection2.size()) ? this.c(n3) : this.c(n4);
        for (Vk vk : collection2) {
            n2 = vk.b() + (int)Math.round((double)n5 * (dArray[0] - this.a(n3, n4)));
            n = n2 > this.c ? n2 : this.c;
            vk.a(n < this.d ? n : this.d);
        }
        for (Vk vk : collection) {
            n2 = vk.b() + (int)Math.round((double)n5 * (dArray[1] - this.a(n3, n4)));
            n = n2 > this.c ? n2 : this.c;
            vk.a(n < this.d ? n : this.d);
        }
    }

    @Override
    public void a(Vo<Rated> vo) {
        if (vo == null || vo.b() == 0) {
            return;
        }
        ArrayList<Vk> arrayList = new ArrayList<Vk>();
        for (Vm<Object> object : vo.a()) {
            for (Vk vk : object.a()) {
                if (arrayList.contains(vk)) continue;
                arrayList.add(vk);
            }
        }
        for (Vk vk : arrayList) {
            int n = vo.a(vk);
            double d2 = 0.0;
            double d3 = 0.0;
            int n2 = 1024;
            for (Vm<Object> vm : vo.a()) {
                if (!vm.c() || !vm.a(vk)) continue;
                int n3 = vo.a(vm.b(vk));
                d2 += vm.e() == vk ? 1.0 : (vm.d() ? 0.5 : 0.0);
                d3 += this.a(n, n3);
                int n4 = this.c(n) < this.c(n3) ? this.c(n) : this.c(n3);
                n2 = n2 < n4 ? n2 : n4;
            }
            int n5 = n + (int)Math.round((double)n2 * (d2 - d3));
            int n6 = n5 > this.c ? n5 : this.c;
            vk.a(this.d < n6 ? this.d : n6);
        }
    }
}

