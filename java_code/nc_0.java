/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * Renamed from nC
 */
public final class nc_0 {
    public static final int a = 4;
    private final nb_0 b;

    private nc_0(nb_0 nb_02) {
        this.b = nb_02;
    }

    public static nc_0 a(nb_0 nb_02) {
        return new nc_0(nb_02);
    }

    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeInt(4);
            this.e(dataOutputStream);
            this.d(dataOutputStream);
            this.c(dataOutputStream);
            this.b(dataOutputStream);
            this.a(dataOutputStream);
            dataOutputStream.close();
        }
        catch (IOException iOException) {
            throw new na_0(iOException);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void a(DataOutputStream dataOutputStream) {
        LinkedList<Integer> linkedList = this.b.c();
        dataOutputStream.writeByte(linkedList.size());
        for (Integer n : linkedList) {
            dataOutputStream.writeInt(n);
        }
    }

    private void b(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.b.f());
        this.b.a((Integer n) -> {
            try {
                dataOutputStream.writeInt((int)n);
            }
            catch (IOException iOException) {
                throw new na_0(iOException);
            }
        });
    }

    private void c(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.b.e());
        this.b.a((Integer n, ns_0 ns_02) -> {
            try {
                dataOutputStream.writeInt(ns_02.a());
                dataOutputStream.writeBoolean(ns_02.b());
                dataOutputStream.writeBoolean(ns_02.c());
                dataOutputStream.writeBoolean(ns_02.g());
                dataOutputStream.writeBoolean(ns_02.f());
                if (ns_02.g()) {
                    dataOutputStream.writeLong(ns_02.d());
                }
                if (ns_02.f()) {
                    dataOutputStream.writeLong(ns_02.e());
                }
            }
            catch (IOException iOException) {
                throw new na_0(iOException);
            }
        });
    }

    private void d(DataOutputStream dataOutputStream) {
        Map<Integer, Long> map = this.b.b();
        dataOutputStream.writeInt(map.size());
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            dataOutputStream.writeInt(entry.getKey());
            dataOutputStream.writeLong(entry.getValue());
        }
    }

    private void e(DataOutputStream dataOutputStream) {
        List<nw_0> list = this.b.a();
        dataOutputStream.writeByte(list.size());
        for (nw_0 nw_02 : list) {
            dataOutputStream.writeInt(nw_02.a());
            dataOutputStream.writeLong(nw_02.b());
        }
    }

    public void a(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        try {
            int n = dataInputStream.readInt();
            this.c(dataInputStream);
            this.b(dataInputStream);
            this.b(dataInputStream, n);
            this.a(dataInputStream, n);
            this.a(dataInputStream);
            dataInputStream.close();
        }
        catch (IOException iOException) {
            throw new na_0(iOException);
        }
    }

    private void a(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedByte();
        for (int k = 0; k < n; ++k) {
            int n2 = dataInputStream.readInt();
            this.b.c(n2);
        }
    }

    private void a(DataInputStream dataInputStream, int n) {
        int n2 = dataInputStream.readInt();
        for (int k = 0; k < n2; ++k) {
            boolean bl;
            int n3 = dataInputStream.readInt();
            if (n < 3) {
                dataInputStream.readInt();
                bl = dataInputStream.readBoolean();
            } else {
                bl = true;
            }
            if (!bl) continue;
            this.b.i(n3);
        }
    }

    private void b(DataInputStream dataInputStream, int n) {
        int n2 = dataInputStream.readInt();
        for (int k = 0; k < n2; ++k) {
            int n3 = dataInputStream.readInt();
            boolean bl = dataInputStream.readBoolean();
            boolean bl2 = dataInputStream.readBoolean();
            boolean bl3 = true;
            boolean bl4 = true;
            if (n >= 4) {
                bl3 = dataInputStream.readBoolean();
                bl4 = dataInputStream.readBoolean();
            }
            Long l = null;
            if (n >= 1 && n < 4 || n >= 4 && bl3) {
                l = dataInputStream.readLong();
            }
            Long l2 = null;
            if (n >= 2 && n < 4 || n >= 4 && bl4) {
                l2 = dataInputStream.readLong();
            }
            this.b.a(new ns_0(n3, bl, bl2, l, l2));
        }
    }

    private void b(DataInputStream dataInputStream) {
        int n = dataInputStream.readInt();
        for (int k = 0; k < n; ++k) {
            int n2 = dataInputStream.readInt();
            long l = dataInputStream.readLong();
            this.b.a(n2, l);
        }
    }

    private void c(DataInputStream dataInputStream) {
        int n = dataInputStream.readUnsignedByte();
        for (int k = 0; k < n; ++k) {
            int n2 = dataInputStream.readInt();
            long l = dataInputStream.readLong();
            this.b.a(new nw_0(n2, l));
        }
    }

    public String toString() {
        return "ServerAchievementSerializer{m_data=" + this.b + "}";
    }
}

