/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from jY
 */
public final class jy_0
extends GeneratedMessageV3
implements kb_0 {
    private static final long p = 0L;
    int q;
    public static final int a = 1;
    long r;
    public static final int b = 2;
    int s;
    public static final int c = 3;
    long t;
    public static final int d = 5;
    volatile Object u;
    public static final int e = 6;
    volatile Object v;
    public static final int f = 7;
    volatile Object w;
    public static final int g = 8;
    int x;
    public static final int h = 9;
    int y;
    public static final int i = 10;
    int z;
    public static final int j = 11;
    int A;
    public static final int k = 12;
    int B;
    public static final int l = 13;
    List<kc_0> C;
    public static final int m = 14;
    List<ju_0> D;
    public static final int n = 15;
    List<jq_0> E;
    private byte F = (byte)-1;
    private static final jy_0 G = new jy_0();
    @Deprecated
    public static final Parser<jy_0> o = new jz_0();

    jy_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jy_0() {
        this.r = 0L;
        this.s = 0;
        this.t = 0L;
        this.u = "";
        this.v = "";
        this.w = "";
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = Collections.emptyList();
        this.D = Collections.emptyList();
        this.E = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jy_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block23: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block23;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block23;
                        bl = true;
                        continue block23;
                    }
                    case 8: {
                        this.q |= 1;
                        this.r = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 16: {
                        this.q |= 2;
                        this.s = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 24: {
                        this.q |= 4;
                        this.t = codedInputStream.readInt64();
                        continue block23;
                    }
                    case 42: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.q |= 8;
                        this.u = byteString;
                        continue block23;
                    }
                    case 50: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.q |= 0x10;
                        this.v = byteString;
                        continue block23;
                    }
                    case 58: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.q |= 0x20;
                        this.w = byteString;
                        continue block23;
                    }
                    case 64: {
                        this.q |= 0x40;
                        this.x = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 72: {
                        this.q |= 0x80;
                        this.y = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 80: {
                        this.q |= 0x100;
                        this.z = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 88: {
                        this.q |= 0x200;
                        this.A = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 96: {
                        this.q |= 0x400;
                        this.B = codedInputStream.readInt32();
                        continue block23;
                    }
                    case 106: {
                        if ((n & 0x800) != 2048) {
                            this.C = new ArrayList<kc_0>();
                            n |= 0x800;
                        }
                        this.C.add((kc_0)codedInputStream.readMessage(kc_0.e, extensionRegistryLite));
                        continue block23;
                    }
                    case 114: {
                        if ((n & 0x1000) != 4096) {
                            this.D = new ArrayList<ju_0>();
                            n |= 0x1000;
                        }
                        this.D.add((ju_0)codedInputStream.readMessage(ju_0.o, extensionRegistryLite));
                        continue block23;
                    }
                    case 122: 
                }
                if ((n & 0x2000) != 8192) {
                    this.E = new ArrayList<jq_0>();
                    n |= 0x2000;
                }
                this.E.add((jq_0)codedInputStream.readMessage(jq_0.d, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 0x800) == 2048) {
                this.C = Collections.unmodifiableList(this.C);
            }
            if ((n & 0x1000) == 4096) {
                this.D = Collections.unmodifiableList(this.D);
            }
            if ((n & 0x2000) == 8192) {
                this.E = Collections.unmodifiableList(this.E);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return jo_0.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.b.ensureFieldAccessorsInitialized(jy_0.class, ka_0.class);
    }

    @Override
    public boolean b() {
        return (this.q & 1) == 1;
    }

    @Override
    public long c() {
        return this.r;
    }

    @Override
    public boolean d() {
        return (this.q & 2) == 2;
    }

    @Override
    public int e() {
        return this.s;
    }

    @Override
    public boolean f() {
        return (this.q & 4) == 4;
    }

    @Override
    public long g() {
        return this.t;
    }

    @Override
    public boolean h() {
        return (this.q & 8) == 8;
    }

    @Override
    public String i() {
        Object object = this.u;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.u = string;
        }
        return string;
    }

    @Override
    public ByteString j() {
        Object object = this.u;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.u = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean k() {
        return (this.q & 0x10) == 16;
    }

    @Override
    public String l() {
        Object object = this.v;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.v = string;
        }
        return string;
    }

    @Override
    public ByteString m() {
        Object object = this.v;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.v = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean n() {
        return (this.q & 0x20) == 32;
    }

    @Override
    public String o() {
        Object object = this.w;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.w = string;
        }
        return string;
    }

    @Override
    public ByteString p() {
        Object object = this.w;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.w = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean q() {
        return (this.q & 0x40) == 64;
    }

    @Override
    public int r() {
        return this.x;
    }

    @Override
    public boolean s() {
        return (this.q & 0x80) == 128;
    }

    @Override
    public int t() {
        return this.y;
    }

    @Override
    public boolean u() {
        return (this.q & 0x100) == 256;
    }

    @Override
    public int v() {
        return this.z;
    }

    @Override
    public boolean w() {
        return (this.q & 0x200) == 512;
    }

    @Override
    public int x() {
        return this.A;
    }

    @Override
    public boolean y() {
        return (this.q & 0x400) == 1024;
    }

    @Override
    public int z() {
        return this.B;
    }

    @Override
    public List<kc_0> A() {
        return this.C;
    }

    @Override
    public List<? extends kf_0> B() {
        return this.C;
    }

    @Override
    public int C() {
        return this.C.size();
    }

    @Override
    public kc_0 a(int n) {
        return this.C.get(n);
    }

    @Override
    public kf_0 b(int n) {
        return this.C.get(n);
    }

    @Override
    public List<ju_0> D() {
        return this.D;
    }

    @Override
    public List<? extends jx_0> E() {
        return this.D;
    }

    @Override
    public int F() {
        return this.D.size();
    }

    @Override
    public ju_0 c(int n) {
        return this.D.get(n);
    }

    @Override
    public jx_0 d(int n) {
        return this.D.get(n);
    }

    @Override
    public List<jq_0> G() {
        return this.E;
    }

    @Override
    public List<? extends jt_0> H() {
        return this.E;
    }

    @Override
    public int I() {
        return this.E.size();
    }

    @Override
    public jq_0 e(int n) {
        return this.E.get(n);
    }

    @Override
    public jt_0 f(int n) {
        return this.E.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.F;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.F = 0;
            return false;
        }
        if (!this.d()) {
            this.F = 0;
            return false;
        }
        if (!this.f()) {
            this.F = 0;
            return false;
        }
        if (!this.h()) {
            this.F = 0;
            return false;
        }
        if (!this.k()) {
            this.F = 0;
            return false;
        }
        if (!this.n()) {
            this.F = 0;
            return false;
        }
        if (!this.q()) {
            this.F = 0;
            return false;
        }
        if (!this.s()) {
            this.F = 0;
            return false;
        }
        if (!this.u()) {
            this.F = 0;
            return false;
        }
        if (!this.w()) {
            this.F = 0;
            return false;
        }
        if (!this.y()) {
            this.F = 0;
            return false;
        }
        for (n = 0; n < this.C(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.F = 0;
            return false;
        }
        for (n = 0; n < this.F(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.F = 0;
            return false;
        }
        for (n = 0; n < this.I(); ++n) {
            if (this.e(n).isInitialized()) continue;
            this.F = 0;
            return false;
        }
        this.F = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        if ((this.q & 1) == 1) {
            codedOutputStream.writeInt64(1, this.r);
        }
        if ((this.q & 2) == 2) {
            codedOutputStream.writeInt32(2, this.s);
        }
        if ((this.q & 4) == 4) {
            codedOutputStream.writeInt64(3, this.t);
        }
        if ((this.q & 8) == 8) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)5, (Object)this.u);
        }
        if ((this.q & 0x10) == 16) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)6, (Object)this.v);
        }
        if ((this.q & 0x20) == 32) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)7, (Object)this.w);
        }
        if ((this.q & 0x40) == 64) {
            codedOutputStream.writeInt32(8, this.x);
        }
        if ((this.q & 0x80) == 128) {
            codedOutputStream.writeInt32(9, this.y);
        }
        if ((this.q & 0x100) == 256) {
            codedOutputStream.writeInt32(10, this.z);
        }
        if ((this.q & 0x200) == 512) {
            codedOutputStream.writeInt32(11, this.A);
        }
        if ((this.q & 0x400) == 1024) {
            codedOutputStream.writeInt32(12, this.B);
        }
        for (n = 0; n < this.C.size(); ++n) {
            codedOutputStream.writeMessage(13, (MessageLite)this.C.get(n));
        }
        for (n = 0; n < this.D.size(); ++n) {
            codedOutputStream.writeMessage(14, (MessageLite)this.D.get(n));
        }
        for (n = 0; n < this.E.size(); ++n) {
            codedOutputStream.writeMessage(15, (MessageLite)this.E.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        if ((this.q & 1) == 1) {
            n2 += CodedOutputStream.computeInt64Size((int)1, (long)this.r);
        }
        if ((this.q & 2) == 2) {
            n2 += CodedOutputStream.computeInt32Size((int)2, (int)this.s);
        }
        if ((this.q & 4) == 4) {
            n2 += CodedOutputStream.computeInt64Size((int)3, (long)this.t);
        }
        if ((this.q & 8) == 8) {
            n2 += GeneratedMessageV3.computeStringSize((int)5, (Object)this.u);
        }
        if ((this.q & 0x10) == 16) {
            n2 += GeneratedMessageV3.computeStringSize((int)6, (Object)this.v);
        }
        if ((this.q & 0x20) == 32) {
            n2 += GeneratedMessageV3.computeStringSize((int)7, (Object)this.w);
        }
        if ((this.q & 0x40) == 64) {
            n2 += CodedOutputStream.computeInt32Size((int)8, (int)this.x);
        }
        if ((this.q & 0x80) == 128) {
            n2 += CodedOutputStream.computeInt32Size((int)9, (int)this.y);
        }
        if ((this.q & 0x100) == 256) {
            n2 += CodedOutputStream.computeInt32Size((int)10, (int)this.z);
        }
        if ((this.q & 0x200) == 512) {
            n2 += CodedOutputStream.computeInt32Size((int)11, (int)this.A);
        }
        if ((this.q & 0x400) == 1024) {
            n2 += CodedOutputStream.computeInt32Size((int)12, (int)this.B);
        }
        for (n = 0; n < this.C.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)13, (MessageLite)((MessageLite)this.C.get(n)));
        }
        for (n = 0; n < this.D.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)14, (MessageLite)((MessageLite)this.D.get(n)));
        }
        for (n = 0; n < this.E.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)15, (MessageLite)((MessageLite)this.E.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jy_0)) {
            return super.equals(object);
        }
        jy_0 jy_02 = (jy_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == jy_02.b();
        if (this.b()) {
            bl = bl && this.c() == jy_02.c();
        }
        boolean bl3 = bl = bl && this.d() == jy_02.d();
        if (this.d()) {
            bl = bl && this.e() == jy_02.e();
        }
        boolean bl4 = bl = bl && this.f() == jy_02.f();
        if (this.f()) {
            bl = bl && this.g() == jy_02.g();
        }
        boolean bl5 = bl = bl && this.h() == jy_02.h();
        if (this.h()) {
            bl = bl && this.i().equals(jy_02.i());
        }
        boolean bl6 = bl = bl && this.k() == jy_02.k();
        if (this.k()) {
            bl = bl && this.l().equals(jy_02.l());
        }
        boolean bl7 = bl = bl && this.n() == jy_02.n();
        if (this.n()) {
            bl = bl && this.o().equals(jy_02.o());
        }
        boolean bl8 = bl = bl && this.q() == jy_02.q();
        if (this.q()) {
            bl = bl && this.r() == jy_02.r();
        }
        boolean bl9 = bl = bl && this.s() == jy_02.s();
        if (this.s()) {
            bl = bl && this.t() == jy_02.t();
        }
        boolean bl10 = bl = bl && this.u() == jy_02.u();
        if (this.u()) {
            bl = bl && this.v() == jy_02.v();
        }
        boolean bl11 = bl = bl && this.w() == jy_02.w();
        if (this.w()) {
            bl = bl && this.x() == jy_02.x();
        }
        boolean bl12 = bl = bl && this.y() == jy_02.y();
        if (this.y()) {
            bl = bl && this.z() == jy_02.z();
        }
        bl = bl && this.A().equals(jy_02.A());
        bl = bl && this.D().equals(jy_02.D());
        bl = bl && this.G().equals(jy_02.G());
        bl = bl && this.unknownFields.equals((Object)jy_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jy_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.g());
        }
        if (this.h()) {
            n = 37 * n + 5;
            n = 53 * n + this.i().hashCode();
        }
        if (this.k()) {
            n = 37 * n + 6;
            n = 53 * n + this.l().hashCode();
        }
        if (this.n()) {
            n = 37 * n + 7;
            n = 53 * n + this.o().hashCode();
        }
        if (this.q()) {
            n = 37 * n + 8;
            n = 53 * n + this.r();
        }
        if (this.s()) {
            n = 37 * n + 9;
            n = 53 * n + this.t();
        }
        if (this.u()) {
            n = 37 * n + 10;
            n = 53 * n + this.v();
        }
        if (this.w()) {
            n = 37 * n + 11;
            n = 53 * n + this.x();
        }
        if (this.y()) {
            n = 37 * n + 12;
            n = 53 * n + this.z();
        }
        if (this.C() > 0) {
            n = 37 * n + 13;
            n = 53 * n + this.A().hashCode();
        }
        if (this.F() > 0) {
            n = 37 * n + 14;
            n = 53 * n + this.D().hashCode();
        }
        if (this.I() > 0) {
            n = 37 * n + 15;
            n = 53 * n + this.G().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jy_0 a(ByteBuffer byteBuffer) {
        return (jy_0)o.parseFrom(byteBuffer);
    }

    public static jy_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jy_0)o.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jy_0 a(ByteString byteString) {
        return (jy_0)o.parseFrom(byteString);
    }

    public static jy_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jy_0)o.parseFrom(byteString, extensionRegistryLite);
    }

    public static jy_0 a(byte[] byArray) {
        return (jy_0)o.parseFrom(byArray);
    }

    public static jy_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jy_0)o.parseFrom(byArray, extensionRegistryLite);
    }

    public static jy_0 a(InputStream inputStream) {
        return (jy_0)GeneratedMessageV3.parseWithIOException(o, (InputStream)inputStream);
    }

    public static jy_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jy_0)GeneratedMessageV3.parseWithIOException(o, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jy_0 b(InputStream inputStream) {
        return (jy_0)GeneratedMessageV3.parseDelimitedWithIOException(o, (InputStream)inputStream);
    }

    public static jy_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jy_0)GeneratedMessageV3.parseDelimitedWithIOException(o, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jy_0 a(CodedInputStream codedInputStream) {
        return (jy_0)GeneratedMessageV3.parseWithIOException(o, (CodedInputStream)codedInputStream);
    }

    public static jy_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jy_0)GeneratedMessageV3.parseWithIOException(o, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ka_0 J() {
        return jy_0.K();
    }

    public static ka_0 K() {
        return G.L();
    }

    public static ka_0 a(jy_0 jy_02) {
        return G.L().a(jy_02);
    }

    public ka_0 L() {
        return this == G ? new ka_0() : new ka_0().a(this);
    }

    protected ka_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        ka_0 ka_02 = new ka_0(builderParent);
        return ka_02;
    }

    public static jy_0 M() {
        return G;
    }

    public static Parser<jy_0> N() {
        return o;
    }

    public Parser<jy_0> getParserForType() {
        return o;
    }

    public jy_0 O() {
        return G;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.L();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.J();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.L();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.J();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.O();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.O();
    }

    static /* synthetic */ boolean P() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean Q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean R() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean S() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jy_0 jy_02) {
        return jy_02.unknownFields;
    }
}

