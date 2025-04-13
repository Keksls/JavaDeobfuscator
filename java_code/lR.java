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
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class lR
extends GeneratedMessageV3
implements lU {
    private static final long f = 0L;
    int g;
    public static final int a = 10;
    int h;
    public static final int b = 11;
    int i;
    public static final int c = 12;
    int j;
    public static final int d = 14;
    int k;
    private byte l = (byte)-1;
    private static final lR m = new lR();
    @Deprecated
    public static final Parser<lR> e = new ls_0();

    lR(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private lR() {
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    lR(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block13;
                        bl2 = true;
                        continue block13;
                    }
                    case 80: {
                        this.g |= 1;
                        this.h = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 88: {
                        this.g |= 2;
                        this.i = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 96: {
                        this.g |= 4;
                        this.j = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 112: 
                }
                this.g |= 8;
                this.k = codedInputStream.readInt32();
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
        return kM.i;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.j.ensureFieldAccessorsInitialized(lR.class, lT.class);
    }

    @Override
    public boolean b() {
        return (this.g & 1) == 1;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public boolean d() {
        return (this.g & 2) == 2;
    }

    @Override
    public int e() {
        return this.i;
    }

    @Override
    public boolean f() {
        return (this.g & 4) == 4;
    }

    @Override
    public int g() {
        return this.j;
    }

    @Override
    public boolean h() {
        return (this.g & 8) == 8;
    }

    @Override
    public int i() {
        return this.k;
    }

    public final boolean isInitialized() {
        byte by = this.l;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.l = 0;
            return false;
        }
        if (!this.d()) {
            this.l = 0;
            return false;
        }
        this.l = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.g & 1) == 1) {
            codedOutputStream.writeInt32(10, this.h);
        }
        if ((this.g & 2) == 2) {
            codedOutputStream.writeInt32(11, this.i);
        }
        if ((this.g & 4) == 4) {
            codedOutputStream.writeInt32(12, this.j);
        }
        if ((this.g & 8) == 8) {
            codedOutputStream.writeInt32(14, this.k);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.g & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)10, (int)this.h);
        }
        if ((this.g & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)11, (int)this.i);
        }
        if ((this.g & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)12, (int)this.j);
        }
        if ((this.g & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)14, (int)this.k);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lR)) {
            return super.equals(object);
        }
        lR lR2 = (lR)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == lR2.b();
        if (this.b()) {
            bl = bl && this.c() == lR2.c();
        }
        boolean bl3 = bl = bl && this.d() == lR2.d();
        if (this.d()) {
            bl = bl && this.e() == lR2.e();
        }
        boolean bl4 = bl = bl && this.f() == lR2.f();
        if (this.f()) {
            bl = bl && this.g() == lR2.g();
        }
        boolean bl5 = bl = bl && this.h() == lR2.h();
        if (this.h()) {
            bl = bl && this.i() == lR2.i();
        }
        bl = bl && this.unknownFields.equals((Object)lR2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + lR.a().hashCode();
        if (this.b()) {
            n = 37 * n + 10;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 11;
            n = 53 * n + this.e();
        }
        if (this.f()) {
            n = 37 * n + 12;
            n = 53 * n + this.g();
        }
        if (this.h()) {
            n = 37 * n + 14;
            n = 53 * n + this.i();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static lR a(ByteBuffer byteBuffer) {
        return (lR)e.parseFrom(byteBuffer);
    }

    public static lR a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (lR)e.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static lR a(ByteString byteString) {
        return (lR)e.parseFrom(byteString);
    }

    public static lR a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (lR)e.parseFrom(byteString, extensionRegistryLite);
    }

    public static lR a(byte[] byArray) {
        return (lR)e.parseFrom(byArray);
    }

    public static lR a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (lR)e.parseFrom(byArray, extensionRegistryLite);
    }

    public static lR a(InputStream inputStream) {
        return (lR)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream);
    }

    public static lR a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lR)GeneratedMessageV3.parseWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lR b(InputStream inputStream) {
        return (lR)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream);
    }

    public static lR b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lR)GeneratedMessageV3.parseDelimitedWithIOException(e, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static lR a(CodedInputStream codedInputStream) {
        return (lR)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream);
    }

    public static lR a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (lR)GeneratedMessageV3.parseWithIOException(e, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lT j() {
        return lR.k();
    }

    public static lT k() {
        return m.l();
    }

    public static lT a(lR lR2) {
        return m.l().a(lR2);
    }

    public lT l() {
        return this == m ? new lT() : new lT().a(this);
    }

    protected lT a(GeneratedMessageV3.BuilderParent builderParent) {
        lT lT2 = new lT(builderParent);
        return lT2;
    }

    public static lR m() {
        return m;
    }

    public static Parser<lR> n() {
        return e;
    }

    public Parser<lR> getParserForType() {
        return e;
    }

    public lR o() {
        return m;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(lR lR2) {
        return lR2.unknownFields;
    }
}

