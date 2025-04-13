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

public final class eK
extends GeneratedMessageV3
implements eN {
    private static final long g = 0L;
    int h;
    public static final int a = 1;
    int i;
    public static final int b = 2;
    volatile Object j;
    public static final int c = 3;
    int k;
    public static final int d = 7;
    int l;
    public static final int e = 8;
    boolean m;
    private byte n = (byte)-1;
    private static final eK o = new eK();
    @Deprecated
    public static final Parser<eK> f = new eL();

    eK(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eK() {
        this.i = 0;
        this.j = "";
        this.k = 0;
        this.l = 0;
        this.m = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block14: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block14;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block14;
                        bl2 = true;
                        continue block14;
                    }
                    case 8: {
                        this.h |= 1;
                        this.i = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 18: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.h |= 2;
                        this.j = byteString;
                        continue block14;
                    }
                    case 24: {
                        this.h |= 4;
                        this.k = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 56: {
                        this.h |= 8;
                        this.l = codedInputStream.readInt32();
                        continue block14;
                    }
                    case 64: 
                }
                this.h |= 0x10;
                this.m = codedInputStream.readBool();
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
        return eI.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eI.d.ensureFieldAccessorsInitialized(eK.class, eM.class);
    }

    @Override
    public boolean b() {
        return (this.h & 1) == 1;
    }

    @Override
    public int c() {
        return this.i;
    }

    @Override
    public boolean d() {
        return (this.h & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.j;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.j = string;
        }
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.j;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.j = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean g() {
        return (this.h & 4) == 4;
    }

    @Override
    public int h() {
        return this.k;
    }

    @Override
    public boolean i() {
        return (this.h & 8) == 8;
    }

    @Override
    public int j() {
        return this.l;
    }

    @Override
    public boolean k() {
        return (this.h & 0x10) == 16;
    }

    @Override
    public boolean l() {
        return this.m;
    }

    public final boolean isInitialized() {
        byte by = this.n;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.n = 0;
            return false;
        }
        if (!this.d()) {
            this.n = 0;
            return false;
        }
        if (!this.g()) {
            this.n = 0;
            return false;
        }
        if (!this.i()) {
            this.n = 0;
            return false;
        }
        this.n = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.h & 1) == 1) {
            codedOutputStream.writeInt32(1, this.i);
        }
        if ((this.h & 2) == 2) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.j);
        }
        if ((this.h & 4) == 4) {
            codedOutputStream.writeInt32(3, this.k);
        }
        if ((this.h & 8) == 8) {
            codedOutputStream.writeInt32(7, this.l);
        }
        if ((this.h & 0x10) == 16) {
            codedOutputStream.writeBool(8, this.m);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.h & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.i);
        }
        if ((this.h & 2) == 2) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.j);
        }
        if ((this.h & 4) == 4) {
            n += CodedOutputStream.computeInt32Size((int)3, (int)this.k);
        }
        if ((this.h & 8) == 8) {
            n += CodedOutputStream.computeInt32Size((int)7, (int)this.l);
        }
        if ((this.h & 0x10) == 16) {
            n += CodedOutputStream.computeBoolSize((int)8, (boolean)this.m);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eK)) {
            return super.equals(object);
        }
        eK eK2 = (eK)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == eK2.b();
        if (this.b()) {
            bl = bl && this.c() == eK2.c();
        }
        boolean bl3 = bl = bl && this.d() == eK2.d();
        if (this.d()) {
            bl = bl && this.e().equals(eK2.e());
        }
        boolean bl4 = bl = bl && this.g() == eK2.g();
        if (this.g()) {
            bl = bl && this.h() == eK2.h();
        }
        boolean bl5 = bl = bl && this.i() == eK2.i();
        if (this.i()) {
            bl = bl && this.j() == eK2.j();
        }
        boolean bl6 = bl = bl && this.k() == eK2.k();
        if (this.k()) {
            bl = bl && this.l() == eK2.l();
        }
        bl = bl && this.unknownFields.equals((Object)eK2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eK.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        if (this.g()) {
            n = 37 * n + 3;
            n = 53 * n + this.h();
        }
        if (this.i()) {
            n = 37 * n + 7;
            n = 53 * n + this.j();
        }
        if (this.k()) {
            n = 37 * n + 8;
            n = 53 * n + Internal.hashBoolean((boolean)this.l());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eK a(ByteBuffer byteBuffer) {
        return (eK)f.parseFrom(byteBuffer);
    }

    public static eK a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eK)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eK a(ByteString byteString) {
        return (eK)f.parseFrom(byteString);
    }

    public static eK a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eK)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static eK a(byte[] byArray) {
        return (eK)f.parseFrom(byArray);
    }

    public static eK a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eK)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static eK a(InputStream inputStream) {
        return (eK)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static eK a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eK)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eK b(InputStream inputStream) {
        return (eK)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static eK b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eK)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eK a(CodedInputStream codedInputStream) {
        return (eK)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static eK a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eK)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eM m() {
        return eK.n();
    }

    public static eM n() {
        return o.o();
    }

    public static eM a(eK eK2) {
        return o.o().a(eK2);
    }

    public eM o() {
        return this == o ? new eM() : new eM().a(this);
    }

    protected eM a(GeneratedMessageV3.BuilderParent builderParent) {
        eM eM2 = new eM(builderParent);
        return eM2;
    }

    public static eK p() {
        return o;
    }

    public static Parser<eK> q() {
        return f;
    }

    public Parser<eK> getParserForType() {
        return f;
    }

    public eK r() {
        return o;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.m();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.r();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.r();
    }

    static /* synthetic */ boolean s() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eK eK2) {
        return eK2.unknownFields;
    }
}

