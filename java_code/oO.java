/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class oO
extends GeneratedMessageV3.Builder<oO>
implements oP {
    private int a;
    private long b;
    private oE c = null;
    private SingleFieldBuilderV3<oE, oG, oL> d;

    public static final Descriptors.Descriptor a() {
        return oC.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oC.b.ensureFieldAccessorsInitialized(oM.class, oO.class);
    }

    oO() {
        this.o();
    }

    oO(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (oM.m()) {
            this.p();
        }
    }

    public oO g() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return oC.a;
    }

    public oM h() {
        return oM.j();
    }

    public oM i() {
        oM oM2 = this.j();
        if (!oM2.isInitialized()) {
            throw oO.newUninitializedMessageException((Message)oM2);
        }
        return oM2;
    }

    public oM j() {
        oM oM2 = new oM(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        oM2.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        oM2.g = this.d == null ? this.c : (oE)this.d.build();
        oM2.e = n2;
        this.onBuilt();
        return oM2;
    }

    public oO k() {
        return (oO)super.clone();
    }

    public oO a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oO)super.setField(fieldDescriptor, object);
    }

    public oO a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (oO)super.clearField(fieldDescriptor);
    }

    public oO a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (oO)super.clearOneof(oneofDescriptor);
    }

    public oO a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (oO)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public oO b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oO)super.addRepeatedField(fieldDescriptor, object);
    }

    public oO a(Message message) {
        if (message instanceof oM) {
            return this.a((oM)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public oO a(oM oM2) {
        if (oM2 == oM.j()) {
            return this;
        }
        if (oM2.b()) {
            this.a(oM2.c());
        }
        if (oM2.d()) {
            this.b(oM2.e());
        }
        this.b(oM.b(oM2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        return !this.d() || this.e().isInitialized();
    }

    public oO a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        oM oM2 = null;
        try {
            oM2 = (oM)oM.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            oM2 = (oM)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (oM2 != null) {
                this.a(oM2);
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

    public oO a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public oO l() {
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
    public oE e() {
        if (this.d == null) {
            return this.c == null ? oE.h() : this.c;
        }
        return (oE)this.d.getMessage();
    }

    public oO a(oE oE2) {
        if (this.d == null) {
            if (oE2 == null) {
                throw new NullPointerException();
            }
            this.c = oE2;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)oE2);
        }
        this.a |= 2;
        return this;
    }

    public oO a(oG oG2) {
        if (this.d == null) {
            this.c = oG2.g();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)oG2.g());
        }
        this.a |= 2;
        return this;
    }

    public oO b(oE oE2) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != oE.h() ? oE.a(this.c).a(oE2).h() : oE2;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)oE2);
        }
        this.a |= 2;
        return this;
    }

    public oO m() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public oG n() {
        this.a |= 2;
        this.onChanged();
        return (oG)this.p().getBuilder();
    }

    @Override
    public oL f() {
        if (this.d != null) {
            return (oL)this.d.getMessageOrBuilder();
        }
        return this.c == null ? oE.h() : this.c;
    }

    private SingleFieldBuilderV3<oE, oG, oL> p() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final oO a(UnknownFieldSet unknownFieldSet) {
        return (oO)super.setUnknownFields(unknownFieldSet);
    }

    public final oO b(UnknownFieldSet unknownFieldSet) {
        return (oO)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

