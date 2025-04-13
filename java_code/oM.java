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

public final class oM
extends GeneratedMessageV3
implements oP {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    oE g;
    private byte h = (byte)-1;
    private static final oM i = new oM();
    @Deprecated
    public static final Parser<oM> c = new oN();

    oM(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private oM() {
        this.f = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    oM(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                oG oG2 = null;
                if ((this.e & 2) == 2) {
                    oG2 = this.g.g();
                }
                this.g = (oE)codedInputStream.readMessage(oE.b, extensionRegistryLite);
                if (oG2 != null) {
                    oG2.a(this.g);
                    this.g = oG2.h();
                }
                this.e |= 2;
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
        return oC.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oC.b.ensureFieldAccessorsInitialized(oM.class, oO.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public oE e() {
        return this.g == null ? oE.h() : this.g;
    }

    @Override
    public oL f() {
        return this.g == null ? oE.h() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (this.d() && !this.e().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oM)) {
            return super.equals(object);
        }
        oM oM2 = (oM)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == oM2.b();
        if (this.b()) {
            bl = bl && this.c() == oM2.c();
        }
        boolean bl3 = bl = bl && this.d() == oM2.d();
        if (this.d()) {
            bl = bl && this.e().equals(oM2.e());
        }
        bl = bl && this.unknownFields.equals((Object)oM2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + oM.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static oM a(ByteBuffer byteBuffer) {
        return (oM)c.parseFrom(byteBuffer);
    }

    public static oM a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (oM)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static oM a(ByteString byteString) {
        return (oM)c.parseFrom(byteString);
    }

    public static oM a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (oM)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static oM a(byte[] byArray) {
        return (oM)c.parseFrom(byArray);
    }

    public static oM a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (oM)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static oM a(InputStream inputStream) {
        return (oM)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static oM a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oM)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oM b(InputStream inputStream) {
        return (oM)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static oM b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oM)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oM a(CodedInputStream codedInputStream) {
        return (oM)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static oM a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oM)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oO g() {
        return oM.h();
    }

    public static oO h() {
        return i.i();
    }

    public static oO a(oM oM2) {
        return i.i().a(oM2);
    }

    public oO i() {
        return this == i ? new oO() : new oO().a(this);
    }

    protected oO a(GeneratedMessageV3.BuilderParent builderParent) {
        oO oO2 = new oO(builderParent);
        return oO2;
    }

    public static oM j() {
        return i;
    }

    public static Parser<oM> k() {
        return c;
    }

    public Parser<oM> getParserForType() {
        return c;
    }

    public oM l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(oM oM2) {
        return oM2.unknownFields;
    }
}

