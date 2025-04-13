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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class oG
extends GeneratedMessageV3.Builder<oG>
implements oL {
    private int a;
    private List<oH> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<oH, oJ, oK> c;

    public static final Descriptors.Descriptor a() {
        return oC.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return oC.d.ensureFieldAccessorsInitialized(oE.class, oG.class);
    }

    oG() {
        this.m();
    }

    oG(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (oE.k()) {
            this.o();
        }
    }

    public oG e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return oC.c;
    }

    public oE f() {
        return oE.h();
    }

    public oE g() {
        oE oE2 = this.h();
        if (!oE2.isInitialized()) {
            throw oG.newUninitializedMessageException((Message)oE2);
        }
        return oE2;
    }

    public oE h() {
        oE oE2 = new oE(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            oE2.d = this.b;
        } else {
            oE2.d = this.c.build();
        }
        this.onBuilt();
        return oE2;
    }

    public oG i() {
        return (oG)super.clone();
    }

    public oG a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oG)super.setField(fieldDescriptor, object);
    }

    public oG a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (oG)super.clearField(fieldDescriptor);
    }

    public oG a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (oG)super.clearOneof(oneofDescriptor);
    }

    public oG a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (oG)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public oG b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (oG)super.addRepeatedField(fieldDescriptor, object);
    }

    public oG a(Message message) {
        if (message instanceof oE) {
            return this.a((oE)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public oG a(oE oE2) {
        if (oE2 == oE.h()) {
            return this;
        }
        if (this.c == null) {
            if (!oE2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = oE2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(oE2.d);
                }
                this.onChanged();
            }
        } else if (!oE2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = oE2.d;
                this.a &= 0xFFFFFFFE;
                this.c = oE.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(oE2.d);
            }
        }
        this.b(oE.b(oE2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public oG a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        oE oE2 = null;
        try {
            oE2 = (oE)oE.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            oE2 = (oE)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (oE2 != null) {
                this.a(oE2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<oH>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<oH> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public oH a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (oH)this.c.getMessage(n);
    }

    public oG a(int n, oH oH2) {
        if (this.c == null) {
            if (oH2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, oH2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)oH2);
        }
        return this;
    }

    public oG a(int n, oJ oJ2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, oJ2.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)oJ2.j());
        }
        return this;
    }

    public oG a(oH oH2) {
        if (this.c == null) {
            if (oH2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(oH2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)oH2);
        }
        return this;
    }

    public oG b(int n, oH oH2) {
        if (this.c == null) {
            if (oH2 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, oH2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)oH2);
        }
        return this;
    }

    public oG a(oJ oJ2) {
        if (this.c == null) {
            this.n();
            this.b.add(oJ2.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)oJ2.j());
        }
        return this;
    }

    public oG b(int n, oJ oJ2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, oJ2.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)oJ2.j());
        }
        return this;
    }

    public oG a(Iterable<? extends oH> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public oG j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public oG c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public oJ d(int n) {
        return (oJ)this.o().getBuilder(n);
    }

    @Override
    public oK b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (oK)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends oK> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public oJ k() {
        return (oJ)this.o().addBuilder((AbstractMessage)oH.k());
    }

    public oJ e(int n) {
        return (oJ)this.o().addBuilder(n, (AbstractMessage)oH.k());
    }

    public List<oJ> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<oH, oJ, oK> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final oG a(UnknownFieldSet unknownFieldSet) {
        return (oG)super.setUnknownFields(unknownFieldSet);
    }

    public final oG b(UnknownFieldSet unknownFieldSet) {
        return (oG)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

