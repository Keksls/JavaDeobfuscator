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

/*
 * Renamed from le
 */
public final class le_0
extends GeneratedMessageV3
implements lp {
    private static final long m = 0L;
    int n;
    public static final int a = 1;
    long o;
    public static final int b = 2;
    int p;
    public static final int c = 3;
    int q;
    public static final int d = 50;
    lg_0 r;
    public static final int e = 51;
    ly s;
    public static final int f = 52;
    lk_0 t;
    public static final int g = 54;
    la u;
    public static final int h = 55;
    lh_0 v;
    public static final int i = 56;
    ll w;
    public static final int j = 57;
    lc_0 x;
    public static final int k = 58;
    int y;
    private byte z = (byte)-1;
    private static final le_0 A = new le_0();
    @Deprecated
    public static final Parser<le_0> l = new lf();

    le_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private le_0() {
        this.o = 0L;
        this.p = 0;
        this.q = 0;
        this.y = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    le_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block20: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block20;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block20;
                        bl2 = true;
                        continue block20;
                    }
                    case 8: {
                        this.n |= 1;
                        this.o = codedInputStream.readInt64();
                        continue block20;
                    }
                    case 16: {
                        this.n |= 2;
                        this.p = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 24: {
                        this.n |= 4;
                        this.q = codedInputStream.readInt32();
                        continue block20;
                    }
                    case 402: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 8) == 8) {
                            builder2 = this.r.y();
                        }
                        this.r = (lg_0)codedInputStream.readMessage(lg_0.k, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.r);
                            this.r = builder2.z();
                        }
                        this.n |= 8;
                        continue block20;
                    }
                    case 410: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 0x10) == 16) {
                            builder2 = this.s.h();
                        }
                        this.s = (ly)codedInputStream.readMessage(ly.c, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.s);
                            this.s = builder2.i();
                        }
                        this.n |= 0x10;
                        continue block20;
                    }
                    case 418: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 0x20) == 32) {
                            builder2 = this.t.p();
                        }
                        this.t = (lk_0)codedInputStream.readMessage(lk_0.f, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.t);
                            this.t = builder2.q();
                        }
                        this.n |= 0x20;
                        continue block20;
                    }
                    case 434: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 0x40) == 64) {
                            builder2 = this.u.f();
                        }
                        this.u = (la)codedInputStream.readMessage(la.b, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.u);
                            this.u = builder2.g();
                        }
                        this.n |= 0x40;
                        continue block20;
                    }
                    case 442: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 0x80) == 128) {
                            builder2 = this.v.h();
                        }
                        this.v = (lh_0)codedInputStream.readMessage(lh_0.c, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.v);
                            this.v = builder2.i();
                        }
                        this.n |= 0x80;
                        continue block20;
                    }
                    case 450: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 0x100) == 256) {
                            builder2 = this.w.h();
                        }
                        this.w = (ll)codedInputStream.readMessage(ll.c, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.w);
                            this.w = builder2.i();
                        }
                        this.n |= 0x100;
                        continue block20;
                    }
                    case 458: {
                        GeneratedMessageV3.Builder builder2 = null;
                        if ((this.n & 0x200) == 512) {
                            builder2 = this.x.g();
                        }
                        this.x = (lc_0)codedInputStream.readMessage(lc_0.b, extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a(this.x);
                            this.x = builder2.h();
                        }
                        this.n |= 0x200;
                        continue block20;
                    }
                    case 464: 
                }
                this.n |= 0x400;
                this.y = codedInputStream.readInt32();
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return kM.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.b.ensureFieldAccessorsInitialized(le_0.class, lg.class);
    }

    @Override
    public boolean b() {
        return (this.n & 1) == 1;
    }

    @Override
    public long c() {
        return this.o;
    }

    @Override
    public boolean d() {
        return (this.n & 2) == 2;
    }

    @Override
    public int e() {
        return this.p;
    }

    @Override
    public boolean f() {
        return (this.n & 4) == 4;
    }

    @Override
    public int g() {
        return this.q;
    }

    @Override
    public boolean h() {
        return (this.n & 8) == 8;
    }

    @Override
    public lg_0 i() {
        return this.r == null ? lg_0.z() : this.r;
    }

    @Override
    public lJ j() {
        return this.r == null ? lg_0.z() : this.r;
    }

    @Override
    public boolean k() {
        return (this.n & 0x10) == 16;
    }

    @Override
    public ly l() {
        return this.s == null ? ly.i() : this.s;
    }

    @Override
    public lb_0 m() {
        return this.s == null ? ly.i() : this.s;
    }

    @Override
    public boolean n() {
        return (this.n & 0x20) == 32;
    }

    @Override
    public lk_0 o() {
        return this.t == null ? lk_0.q() : this.t;
    }

    @Override
    public lV p() {
        return this.t == null ? lk_0.q() : this.t;
    }

    @Override
    public boolean q() {
        return (this.n & 0x40) == 64;
    }

    @Override
    public la r() {
        return this.u == null ? la.g() : this.u;
    }

    @Override
    public ld_0 s() {
        return this.u == null ? la.g() : this.u;
    }

    @Override
    public boolean t() {
        return (this.n & 0x80) == 128;
    }

    @Override
    public lh_0 u() {
        return this.v == null ? lh_0.i() : this.v;
    }

    @Override
    public lk v() {
        return this.v == null ? lh_0.i() : this.v;
    }

    @Override
    public boolean w() {
        return (this.n & 0x100) == 256;
    }

    @Override
    public ll x() {
        return this.w == null ? ll.i() : this.w;
    }

    @Override
    public lo y() {
        return this.w == null ? ll.i() : this.w;
    }

    @Override
    public boolean z() {
        return (this.n & 0x200) == 512;
    }

    @Override
    public lc_0 A() {
        return this.x == null ? lc_0.h() : this.x;
    }

    @Override
    public lf_0 B() {
        return this.x == null ? lc_0.h() : this.x;
    }

    @Override
    public boolean C() {
        return (this.n & 0x400) == 1024;
    }

    @Override
    public int D() {
        return this.y;
    }

    public final boolean isInitialized() {
        byte by = this.z;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.z = 0;
            return false;
        }
        if (!this.d()) {
            this.z = 0;
            return false;
        }
        if (!this.f()) {
            this.z = 0;
            return false;
        }
        if (this.h() && !this.i().isInitialized()) {
            this.z = 0;
            return false;
        }
        if (this.k() && !this.l().isInitialized()) {
            this.z = 0;
            return false;
        }
        if (this.n() && !this.o().isInitialized()) {
            this.z = 0;
            return false;
        }
        if (this.q() && !this.r().isInitialized()) {
            this.z = 0;
            return false;
        }
        if (this.t() && !this.u().isInitialized()) {
            this.z = 0;
            return false;
        }
        if (this.w() && !this.x().isInitialized()) {
            this.z = 0;
            return false;
        }
        if (this.z() && !this.A().isInitialized()) {
            this.z = 0;
            return false;
        }
        this.z = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.n & 1) == 1) {
            codedOutputStream.writeInt64(1, this.o);
        }
        if ((this.n & 2) == 2) {
            codedOutputStream.writeInt32(2, this.p);
        }
        if ((this.n & 4) == 4) {
            codedOutputStream.writeInt32(3, this.q);
        }
        if ((this.n & 8) == 8) {
            codedOutputStream.writeMessage(50, (MessageLite)this.i());
        }
        if ((this.n & 0x10) == 16) {
            codedOutputStream.writeMessage(51, (MessageLite)this.l());
        }
        if ((this.n & 0x20) == 32) {
            codedOutputStream.writeMessage(52, (MessageLite)this.o());
        }
        if ((this.n & 0x40) == 64) {
            codedOutputStream.writeMessage(54, (MessageLite)this.r());
        }
        if ((this.n & 0x80) == 128) {
            codedOutputStream.writeMessage(55, (MessageLite)this.u());
        }
        if ((this.n & 0x100) == 256) {
            codedOutputStream.writeMessage(56, (MessageLite)this.x());
        }
        if ((this.n & 0x200) == 512) {
            codedOutputStream.writeMessage(57, (MessageLite)this.A());
        }
        if ((this.n & 0x400) == 1024) {
            codedOutputStream.writeInt32(58, this.y);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.n & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.o);
        }
        if ((this.n & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.p);
        }
        if ((this.n & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.q);
        }
        if ((this.n & 8) == 8) {
            n += CodedOutputStream.computeMessageSize((int)50, (MessageLite)this.i());
        }
        if ((this.n & 0x10) == 16) {
            n += CodedOutputStream.computeMessageSize((int)51, (MessageLite)this.l());
        }
        if ((this.n & 0x20) == 32) {
            n += CodedOutputStream.computeMessageSize((int)52, (MessageLite)this.o());
        }
        if ((this.n & 0x40) == 64) {
            n += CodedOutputStream.computeMessageSize((int)54, (MessageLite)this.r());
        }
        if ((this.n & 0x80) == 128) {
            n += CodedOutputStream.computeMessageSize((int)55, (MessageLite)this.u());
        }
        if ((this.n & 0x100) == 256) {
            n += CodedOutputStream.computeMessageSize((int)56, (MessageLite)this.x());
        }
        if ((this.n & 0x200) == 512) {
            n += CodedOutputStream.computeMessageSize((int)57, (MessageLite)this.A());
        }
        if ((this.n & 0x400) == 1024) {
            n += CodedOutputStream.computeInt32Size((int)58, (int)this.y);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof le_0)) {
            return super.equals(object);
        }
        le_0 le_02 = (le_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == le_02.b();
        if (this.b()) {
            bl = bl && this.c() == le_02.c();
        }
        boolean bl3 = bl = bl && this.d() == le_02.d();
        if (this.d()) {
            bl = bl && this.e() == le_02.e();
        }
        boolean bl4 = bl = bl && this.f() == le_02.f();
        if (this.f()) {
            bl = bl && this.g() == le_02.g();
        }
        boolean bl5 = bl = bl && this.h() == le_02.h();
        if (this.h()) {
            bl = bl && this.i().equals(le_02.i());
        }
        boolean bl6 = bl = bl && this.k() == le_02.k();
        if (this.k()) {
            bl = bl && this.l().equals(le_02.l());
        }
        boolean bl7 = bl = bl && this.n() == le_02.n();
        if (this.n()) {
            bl = bl && this.o().equals(le_02.o());
        }
        boolean bl8 = bl = bl && this.q() == le_02.q();
        if (this.q()) {
            bl = bl && this.r().equals(le_02.r());
        }
        boolean bl9 = bl = bl && this.t() == le_02.t();
        if (this.t()) {
            bl = bl && this.u().equals(le_02.u());
        }
        boolean bl10 = bl = bl && this.w() == le_02.w();
        if (this.w()) {
            bl = bl && this.x().equals(le_02.x());
        }
        boolean bl11 = bl = bl && this.z() == le_02.z();
        if (this.z()) {
            bl = bl && this.A().equals(le_02.A());
        }
        boolean bl12 = bl = bl && this.C() == le_02.C();
        if (this.C()) {
            bl = bl && this.D() == le_02.D();
        }
        bl = bl && this.unknownFields.equals((Object)le_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + le_0.a().hashCode();
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
            n = 53 * n + this.g();
        }
        if (this.h()) {
            n = 37 * n + 50;
            n = 53 * n + this.i().hashCode();
        }
        if (this.k()) {
            n = 37 * n + 51;
            n = 53 * n + this.l().hashCode();
        }
        if (this.n()) {
            n = 37 * n + 52;
            n = 53 * n + this.o().hashCode();
        }
        if (this.q()) {
            n = 37 * n + 54;
            n = 53 * n + this.r().hashCode();
        }
        if (this.t()) {
            n = 37 * n + 55;
            n = 53 * n + this.u().hashCode();
        }
        if (this.w()) {
            n = 37 * n + 56;
            n = 53 * n + this.x().hashCode();
        }
        if (this.z()) {
            n = 37 * n + 57;
            n = 53 * n + this.A().hashCode();
        }
        if (this.C()) {
            n = 37 * n + 58;
            n = 53 * n + this.D();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static le_0 a(ByteBuffer byteBuffer) {
        return (le_0)l.parseFrom(byteBuffer);
    }

    public static le_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (le_0)l.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static le_0 a(ByteString byteString) {
        return (le_0)l.parseFrom(byteString);
    }

    public static le_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (le_0)l.parseFrom(byteString, extensionRegistryLite);
    }

    public static le_0 a(byte[] byArray) {
        return (le_0)l.parseFrom(byArray);
    }

    public static le_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (le_0)l.parseFrom(byArray, extensionRegistryLite);
    }

    public static le_0 a(InputStream inputStream) {
        return (le_0)GeneratedMessageV3.parseWithIOException(l, (InputStream)inputStream);
    }

    public static le_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (le_0)GeneratedMessageV3.parseWithIOException(l, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static le_0 b(InputStream inputStream) {
        return (le_0)GeneratedMessageV3.parseDelimitedWithIOException(l, (InputStream)inputStream);
    }

    public static le_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (le_0)GeneratedMessageV3.parseDelimitedWithIOException(l, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static le_0 a(CodedInputStream codedInputStream) {
        return (le_0)GeneratedMessageV3.parseWithIOException(l, (CodedInputStream)codedInputStream);
    }

    public static le_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (le_0)GeneratedMessageV3.parseWithIOException(l, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lg E() {
        return le_0.F();
    }

    public static lg F() {
        return A.G();
    }

    public static lg a(le_0 le_02) {
        return A.G().a(le_02);
    }

    public lg G() {
        return this == A ? new lg() : new lg().a(this);
    }

    protected lg a(GeneratedMessageV3.BuilderParent builderParent) {
        lg lg2 = new lg(builderParent);
        return lg2;
    }

    public static le_0 H() {
        return A;
    }

    public static Parser<le_0> I() {
        return l;
    }

    public Parser<le_0> getParserForType() {
        return l;
    }

    public le_0 J() {
        return A;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.G();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.E();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.G();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.E();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.J();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.J();
    }

    static /* synthetic */ boolean K() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(le_0 le_02) {
        return le_02.unknownFields;
    }
}

