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

public final class mE
extends GeneratedMessageV3
implements mH {
    private static final long i = 0L;
    int j;
    public static final int a = 1;
    long k;
    public static final int b = 2;
    int l;
    public static final int c = 3;
    long m;
    public static final int d = 4;
    long n;
    public static final int e = 5;
    int o;
    public static final int f = 6;
    long p;
    public static final int g = 7;
    le_0 q;
    private byte r = (byte)-1;
    private static final mE s = new mE();
    @Deprecated
    public static final Parser<mE> h = new mF();

    mE(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private mE() {
        this.k = 0L;
        this.l = 0;
        this.m = 0L;
        this.n = 0L;
        this.o = 0;
        this.p = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    mE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block16: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block16;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block16;
                        bl2 = true;
                        continue block16;
                    }
                    case 8: {
                        this.j |= 1;
                        this.k = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 16: {
                        int n2 = codedInputStream.readEnum();
                        mI mI2 = mI.a(n2);
                        if (mI2 == null) {
                            builder.mergeVarintField(2, n2);
                            continue block16;
                        }
                        this.j |= 2;
                        this.l = n2;
                        continue block16;
                    }
                    case 24: {
                        this.j |= 4;
                        this.m = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 32: {
                        this.j |= 8;
                        this.n = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 40: {
                        this.j |= 0x10;
                        this.o = codedInputStream.readInt32();
                        continue block16;
                    }
                    case 48: {
                        this.j |= 0x20;
                        this.p = codedInputStream.readInt64();
                        continue block16;
                    }
                    case 58: 
                }
                lg lg2 = null;
                if ((this.j & 0x40) == 64) {
                    lg2 = this.q.G();
                }
                this.q = (le_0)codedInputStream.readMessage(le_0.l, extensionRegistryLite);
                if (lg2 != null) {
                    lg2.a(this.q);
                    this.q = lg2.H();
                }
                this.j |= 0x40;
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
        return mC.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mC.d.ensureFieldAccessorsInitialized(mE.class, mG.class);
    }

    @Override
    public boolean b() {
        return (this.j & 1) == 1;
    }

    @Override
    public long c() {
        return this.k;
    }

    @Override
    public boolean d() {
        return (this.j & 2) == 2;
    }

    @Override
    public mI e() {
        mI mI2 = mI.a(this.l);
        return mI2 == null ? mI.a : mI2;
    }

    @Override
    public boolean f() {
        return (this.j & 4) == 4;
    }

    @Override
    public long g() {
        return this.m;
    }

    @Override
    public boolean h() {
        return (this.j & 8) == 8;
    }

    @Override
    public long i() {
        return this.n;
    }

    @Override
    public boolean j() {
        return (this.j & 0x10) == 16;
    }

    @Override
    public int k() {
        return this.o;
    }

    @Override
    public boolean l() {
        return (this.j & 0x20) == 32;
    }

    @Override
    public long m() {
        return this.p;
    }

    @Override
    public boolean n() {
        return (this.j & 0x40) == 64;
    }

    @Override
    public le_0 o() {
        return this.q == null ? le_0.H() : this.q;
    }

    @Override
    public lp p() {
        return this.q == null ? le_0.H() : this.q;
    }

    public final boolean isInitialized() {
        byte by = this.r;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.r = 0;
            return false;
        }
        if (!this.d()) {
            this.r = 0;
            return false;
        }
        if (!this.f()) {
            this.r = 0;
            return false;
        }
        if (!this.h()) {
            this.r = 0;
            return false;
        }
        if (!this.j()) {
            this.r = 0;
            return false;
        }
        if (!this.l()) {
            this.r = 0;
            return false;
        }
        if (!this.n()) {
            this.r = 0;
            return false;
        }
        if (!this.o().isInitialized()) {
            this.r = 0;
            return false;
        }
        this.r = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.j & 1) == 1) {
            codedOutputStream.writeInt64(1, this.k);
        }
        if ((this.j & 2) == 2) {
            codedOutputStream.writeEnum(2, this.l);
        }
        if ((this.j & 4) == 4) {
            codedOutputStream.writeInt64(3, this.m);
        }
        if ((this.j & 8) == 8) {
            codedOutputStream.writeInt64(4, this.n);
        }
        if ((this.j & 0x10) == 16) {
            codedOutputStream.writeInt32(5, this.o);
        }
        if ((this.j & 0x20) == 32) {
            codedOutputStream.writeInt64(6, this.p);
        }
        if ((this.j & 0x40) == 64) {
            codedOutputStream.writeMessage(7, (MessageLite)this.o());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.j & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.k);
        }
        if ((this.j & 2) == 2) {
            n += CodedOutputStream.computeEnumSize((int)2, (int)this.l);
        }
        if ((this.j & 4) == 4) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.m);
        }
        if ((this.j & 8) == 8) {
            n += CodedOutputStream.computeInt64Size((int)4, (long)this.n);
        }
        if ((this.j & 0x10) == 16) {
            n += CodedOutputStream.computeInt32Size((int)5, (int)this.o);
        }
        if ((this.j & 0x20) == 32) {
            n += CodedOutputStream.computeInt64Size((int)6, (long)this.p);
        }
        if ((this.j & 0x40) == 64) {
            n += CodedOutputStream.computeMessageSize((int)7, (MessageLite)this.o());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof mE)) {
            return super.equals(object);
        }
        mE mE2 = (mE)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == mE2.b();
        if (this.b()) {
            bl = bl && this.c() == mE2.c();
        }
        boolean bl3 = bl = bl && this.d() == mE2.d();
        if (this.d()) {
            bl = bl && this.l == mE2.l;
        }
        boolean bl4 = bl = bl && this.f() == mE2.f();
        if (this.f()) {
            bl = bl && this.g() == mE2.g();
        }
        boolean bl5 = bl = bl && this.h() == mE2.h();
        if (this.h()) {
            bl = bl && this.i() == mE2.i();
        }
        boolean bl6 = bl = bl && this.j() == mE2.j();
        if (this.j()) {
            bl = bl && this.k() == mE2.k();
        }
        boolean bl7 = bl = bl && this.l() == mE2.l();
        if (this.l()) {
            bl = bl && this.m() == mE2.m();
        }
        boolean bl8 = bl = bl && this.n() == mE2.n();
        if (this.n()) {
            bl = bl && this.o().equals(mE2.o());
        }
        bl = bl && this.unknownFields.equals((Object)mE2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + mE.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.l;
        }
        if (this.f()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.g());
        }
        if (this.h()) {
            n = 37 * n + 4;
            n = 53 * n + Internal.hashLong((long)this.i());
        }
        if (this.j()) {
            n = 37 * n + 5;
            n = 53 * n + this.k();
        }
        if (this.l()) {
            n = 37 * n + 6;
            n = 53 * n + Internal.hashLong((long)this.m());
        }
        if (this.n()) {
            n = 37 * n + 7;
            n = 53 * n + this.o().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static mE a(ByteBuffer byteBuffer) {
        return (mE)h.parseFrom(byteBuffer);
    }

    public static mE a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static mE a(ByteString byteString) {
        return (mE)h.parseFrom(byteString);
    }

    public static mE a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static mE a(byte[] byArray) {
        return (mE)h.parseFrom(byArray);
    }

    public static mE a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static mE a(InputStream inputStream) {
        return (mE)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static mE a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mE b(InputStream inputStream) {
        return (mE)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static mE b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static mE a(CodedInputStream codedInputStream) {
        return (mE)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static mE a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (mE)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public mG q() {
        return mE.r();
    }

    public static mG r() {
        return s.s();
    }

    public static mG a(mE mE2) {
        return s.s().a(mE2);
    }

    public mG s() {
        return this == s ? new mG() : new mG().a(this);
    }

    protected mG a(GeneratedMessageV3.BuilderParent builderParent) {
        mG mG2 = new mG(builderParent);
        return mG2;
    }

    public static mE t() {
        return s;
    }

    public static Parser<mE> u() {
        return h;
    }

    public Parser<mE> getParserForType() {
        return h;
    }

    public mE v() {
        return s;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.s();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.q();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.s();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.q();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.v();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.v();
    }

    static /* synthetic */ boolean w() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(mE mE2) {
        return mE2.unknownFields;
    }
}

