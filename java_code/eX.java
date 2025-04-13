/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class eX
extends GeneratedMessageV3.Builder<eX>
implements fk {
    private int a;
    private long b;
    private Object c = "";
    private Object d = "";
    private int e;
    private Object f = "";

    public static final Descriptors.Descriptor a() {
        return eT.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.d.ensureFieldAccessorsInitialized(eV.class, eX.class);
    }

    eX() {
        this.y();
    }

    eX(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.y();
    }

    private void y() {
        if (eV.u()) {
            // empty if block
        }
    }

    public eX o() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = "";
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = "";
        this.a &= 0xFFFFFFEF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eT.c;
    }

    public eV p() {
        return eV.r();
    }

    public eV q() {
        eV eV2 = this.r();
        if (!eV2.isInitialized()) {
            throw eX.newUninitializedMessageException((Message)eV2);
        }
        return eV2;
    }

    public eV r() {
        eV eV2 = new eV(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        eV2.i = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        eV2.j = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        eV2.k = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        eV2.l = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        eV2.m = this.f;
        eV2.h = n2;
        this.onBuilt();
        return eV2;
    }

    public eX s() {
        return (eX)super.clone();
    }

    public eX a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eX)super.setField(fieldDescriptor, object);
    }

    public eX a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (eX)super.clearField(fieldDescriptor);
    }

    public eX a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (eX)super.clearOneof(oneofDescriptor);
    }

    public eX a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (eX)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public eX b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (eX)super.addRepeatedField(fieldDescriptor, object);
    }

    public eX a(Message message) {
        if (message instanceof eV) {
            return this.a((eV)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public eX a(eV eV2) {
        if (eV2 == eV.r()) {
            return this;
        }
        if (eV2.b()) {
            this.a(eV2.c());
        }
        if (eV2.d()) {
            this.a |= 2;
            this.c = eV2.j;
            this.onChanged();
        }
        if (eV2.g()) {
            this.a |= 4;
            this.d = eV2.k;
            this.onChanged();
        }
        if (eV2.j()) {
            this.a(eV2.k());
        }
        if (eV2.l()) {
            this.a |= 0x10;
            this.f = eV2.m;
            this.onChanged();
        }
        this.b(eV.b(eV2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return this.d();
    }

    public eX a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eV eV2 = null;
        try {
            eV2 = (eV)eV.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eV2 = (eV)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eV2 != null) {
                this.a(eV2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public eX a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public eX t() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eX a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public eX u() {
        this.a &= 0xFFFFFFFD;
        this.c = eV.r().e();
        this.onChanged();
        return this;
    }

    public eX a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public String h() {
        Object object = this.d;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.d = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString i() {
        Object object = this.d;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.d = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eX b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = string;
        this.onChanged();
        return this;
    }

    public eX v() {
        this.a &= 0xFFFFFFFB;
        this.d = eV.r().h();
        this.onChanged();
        return this;
    }

    public eX b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 4;
        this.d = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public int k() {
        return this.e;
    }

    public eX a(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public eX w() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public String m() {
        Object object = this.f;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString n() {
        Object object = this.f;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.f = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public eX c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.f = string;
        this.onChanged();
        return this;
    }

    public eX x() {
        this.a &= 0xFFFFFFEF;
        this.f = eV.r().m();
        this.onChanged();
        return this;
    }

    public eX c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.f = byteString;
        this.onChanged();
        return this;
    }

    public final eX a(UnknownFieldSet unknownFieldSet) {
        return (eX)super.setUnknownFields(unknownFieldSet);
    }

    public final eX b(UnknownFieldSet unknownFieldSet) {
        return (eX)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.o();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.s();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.o();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.s();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.s();
    }

    public /* synthetic */ Message buildPartial() {
        return this.r();
    }

    public /* synthetic */ Message build() {
        return this.q();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.o();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.s();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.r();
    }

    public /* synthetic */ MessageLite build() {
        return this.q();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.o();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.p();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.s();
    }

    public /* synthetic */ Object clone() {
        return this.s();
    }
}

