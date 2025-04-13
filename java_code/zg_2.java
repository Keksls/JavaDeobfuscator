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
 * Renamed from zG
 */
public final class zg_2
extends GeneratedMessageV3
implements zj_2 {
    private static final long j = 0L;
    int k;
    public static final int a = 1;
    int l;
    public static final int b = 2;
    int m;
    public static final int c = 3;
    int n;
    public static final int d = 4;
    int o;
    public static final int e = 5;
    int p;
    public static final int f = 6;
    boolean q;
    public static final int g = 7;
    long r;
    public static final int h = 8;
    int s;
    private byte t = (byte)-1;
    private static final zg_2 u = new zg_2();
    @Deprecated
    public static final Parser<zg_2> i = new zh_2();

    zg_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private zg_2() {
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = false;
        this.r = 0L;
        this.s = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    zg_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block17: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block17;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block17;
                        bl2 = true;
                        continue block17;
                    }
                    case 8: {
                        this.k |= 1;
                        this.l = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 16: {
                        this.k |= 2;
                        this.m = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 24: {
                        this.k |= 4;
                        this.n = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 32: {
                        this.k |= 8;
                        this.o = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 40: {
                        this.k |= 0x10;
                        this.p = codedInputStream.readInt32();
                        continue block17;
                    }
                    case 48: {
                        this.k |= 0x20;
                        this.q = codedInputStream.readBool();
                        continue block17;
                    }
                    case 56: {
                        this.k |= 0x40;
                        this.r = codedInputStream.readInt64();
                        continue block17;
                    }
                    case 64: 
                }
                this.k |= 0x80;
                this.s = codedInputStream.readInt32();
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
        return zw_1.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return zw_1.d.ensureFieldAccessorsInitialized(zg_2.class, zi_2.class);
    }

    @Override
    public boolean b() {
        return (this.k & 1) == 1;
    }

    @Override
    public int c() {
        return this.l;
    }

    @Override
    public boolean d() {
        return (this.k & 2) == 2;
    }

    @Override
    public int e() {
        return this.m;
    }

    @Override
    public boolean f() {
        return (this.k & 4) == 4;
    }

    @Override
    public int g() {
        return this.n;
    }

    @Override
    public boolean h() {
        return (this.k & 8) == 8;
    }

    @Override
    public int i() {
        return this.o;
    }

    @Override
    public boolean j() {
        return (this.k & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.p;
    }

    @Override
    public boolean l() {
        return (this.k & 0x20) == 32;
    }

    @Override
    public boolean m() {
        return this.q;
    }

    @Override
    public boolean n() {
        return (this.k & 0x40) == 64;
    }

    @Override
    public long o() {
        return this.r;
    }

    @Override
    public boolean p() {
        return (this.k & 0x80) == 128;
    }

    @Override
    public int q() {
        return this.s;
    }

    public final boolean isInitialized() {
        byte by = this.t;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.t = 0;
            return false;
        }
        if (!this.d()) {
            this.t = 0;
            return false;
        }
        if (!this.f()) {
            this.t = 0;
            return false;
        }
        if (!this.h()) {
            this.t = 0;
            return false;
        }
        if (!this.j()) {
            this.t = 0;
            return false;
        }
        if (!this.l()) {
            this.t = 0;
            return false;
        }
        this.t = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.k & 1) == 1) {
            codedOutputStream.writeInt32(1, this.l);
        }
        if ((this.k & 2) == 2) {
            codedOutputStream.writeInt32(2, this.m);
        }
        if ((this.k & 4) == 4) {
            codedOutputStream.writeInt32(3, this.n);
        }
        if ((this.k & 8) == 8) {
            codedOutputStream.writeInt32(4, this.o);
        }
        if ((this.k & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.p);
        }
        if ((this.k & 0x20) == 32) {
            codedOutputStream.writeBool(6, this.q);
        }
        if ((this.k & 0x40) == 64) {
            codedOutputStream.writeInt64(7, this.r);
        }
        if ((this.k & 0x80) == 128) {
            codedOutputStream.writeInt32(8, this.s);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.k & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.l);
        }
        if ((this.k & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.m);
        }
        if ((this.k & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.n);
        }
        if ((this.k & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.o);
        }
        if ((this.k & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.p);
        }
        if ((this.k & 0x20) == 32) {
            n += CodedOutputStream.computeBoolSize((int)6, (boolean)this.q);
        }
        if ((this.k & 0x40) == 64) {
            n += CodedOutputStream.computeInt64Size((int)7, (long)this.r);
        }
        if ((this.k & 0x80) == 128) {
            n += CodedOutputStream.computeInt32Size((int)8, (int)this.s);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof zg_2)) {
            return super.equals(object);
        }
        zg_2 zg_22 = (zg_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == zg_22.b();
        if (this.b()) {
            bl = bl && this.c() == zg_22.c();
        }
        boolean bl3 = bl = bl && this.d() == zg_22.d();
        if (this.d()) {
            bl = bl && this.e() == zg_22.e();
        }
        boolean bl4 = bl = bl && this.f() == zg_22.f();
        if (this.f()) {
            bl = bl && this.g() == zg_22.g();
        }
        boolean bl5 = bl = bl && this.h() == zg_22.h();
        if (this.h()) {
            bl = bl && this.i() == zg_22.i();
        }
        boolean bl6 = bl = bl && this.j() == zg_22.j();
        if (this.j()) {
            bl = bl && this.k() == zg_22.k();
        }
        boolean bl7 = bl = bl && this.l() == zg_22.l();
        if (this.l()) {
            bl = bl && this.m() == zg_22.m();
        }
        boolean bl8 = bl = bl && this.n() == zg_22.n();
        if (this.n()) {
            bl = bl && this.o() == zg_22.o();
        }
        boolean bl9 = bl = bl && this.p() == zg_22.p();
        if (this.p()) {
            bl = bl && this.q() == zg_22.q();
        }
        bl = bl && this.unknownFields.equals((Object)zg_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + zg_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
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
            n = 37 * n + 4;
            n = 53 * n + this.i();
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashBoolean((boolean)this.m());
        }
        if (this.n()) {
            n = 37 * n + 7;
            n = 53 * n + Internal.hashLong((long)this.o());
        }
        if (this.p()) {
            n = 37 * n + 8;
            n = 53 * n + this.q();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static zg_2 a(ByteBuffer byteBuffer) {
        return (zg_2)i.parseFrom(byteBuffer);
    }

    public static zg_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (zg_2)i.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static zg_2 a(ByteString byteString) {
        return (zg_2)i.parseFrom(byteString);
    }

    public static zg_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (zg_2)i.parseFrom(byteString, extensionRegistryLite);
    }

    public static zg_2 a(byte[] byArray) {
        return (zg_2)i.parseFrom(byArray);
    }

    public static zg_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (zg_2)i.parseFrom(byArray, extensionRegistryLite);
    }

    public static zg_2 a(InputStream inputStream) {
        return (zg_2)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream);
    }

    public static zg_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zg_2)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zg_2 b(InputStream inputStream) {
        return (zg_2)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream);
    }

    public static zg_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zg_2)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static zg_2 a(CodedInputStream codedInputStream) {
        return (zg_2)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream);
    }

    public static zg_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (zg_2)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public zi_2 r() {
        return zg_2.s();
    }

    public static zi_2 s() {
        return u.t();
    }

    public static zi_2 a(zg_2 zg_22) {
        return u.t().a(zg_22);
    }

    public zi_2 t() {
        return this == u ? new zi_2() : new zi_2().a(this);
    }

    protected zi_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        zi_2 zi_22 = new zi_2(builderParent);
        return zi_22;
    }

    public static zg_2 u() {
        return u;
    }

    public static Parser<zg_2> v() {
        return i;
    }

    public Parser<zg_2> getParserForType() {
        return i;
    }

    public zg_2 w() {
        return u;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.t();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.r();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.t();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.r();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.w();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.w();
    }

    static /* synthetic */ boolean x() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(zg_2 zg_22) {
        return zg_22.unknownFields;
    }
}

