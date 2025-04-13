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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class oE
extends GeneratedMessageV3
implements oL {
    private static final long c = 0L;
    public static final int a = 1;
    List<oH> d;
    private byte e = (byte)-1;
    private static final oE f = new oE();
    @Deprecated
    public static final Parser<oE> b = new oF();

    oE(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private oE() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    oE(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = new ArrayList<oH>();
                    bl |= true;
                }
                this.d.add((oH)codedInputStream.readMessage(oH.d, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return oC.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oC.d.ensureFieldAccessorsInitialized(oE.class, oG.class);
    }

    @Override
    public List<oH> b() {
        return this.d;
    }

    @Override
    public List<? extends oK> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public oH a(int n) {
        return this.d.get(n);
    }

    @Override
    public oK b(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.d.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.d.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof oE)) {
            return super.equals(object);
        }
        oE oE2 = (oE)object;
        boolean bl = true;
        bl = bl && this.b().equals(oE2.b());
        bl = bl && this.unknownFields.equals((Object)oE2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + oE.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static oE a(ByteBuffer byteBuffer) {
        return (oE)b.parseFrom(byteBuffer);
    }

    public static oE a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (oE)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static oE a(ByteString byteString) {
        return (oE)b.parseFrom(byteString);
    }

    public static oE a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (oE)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static oE a(byte[] byArray) {
        return (oE)b.parseFrom(byArray);
    }

    public static oE a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (oE)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static oE a(InputStream inputStream) {
        return (oE)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static oE a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oE)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oE b(InputStream inputStream) {
        return (oE)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static oE b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oE)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static oE a(CodedInputStream codedInputStream) {
        return (oE)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static oE a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (oE)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oG e() {
        return oE.f();
    }

    public static oG f() {
        return f.g();
    }

    public static oG a(oE oE2) {
        return f.g().a(oE2);
    }

    public oG g() {
        return this == f ? new oG() : new oG().a(this);
    }

    protected oG a(GeneratedMessageV3.BuilderParent builderParent) {
        oG oG2 = new oG(builderParent);
        return oG2;
    }

    public static oE h() {
        return f;
    }

    public static Parser<oE> i() {
        return b;
    }

    public Parser<oE> getParserForType() {
        return b;
    }

    public oE j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(oE oE2) {
        return oE2.unknownFields;
    }
}

