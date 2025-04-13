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

public final class fh
extends GeneratedMessageV3.Builder<fh>
implements fi {
    private int a;
    private List<eY> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<eY, fa, fb> c;
    private List<eY> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<eY, fa, fb> e;

    public static final Descriptors.Descriptor a() {
        return eT.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.f.ensureFieldAccessorsInitialized(ff.class, fh.class);
    }

    fh() {
        this.s();
    }

    fh(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.s();
    }

    private void s() {
        if (ff.n()) {
            this.u();
            this.w();
        }
    }

    public fh h() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.e.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return eT.e;
    }

    public ff i() {
        return ff.k();
    }

    public ff j() {
        ff ff2 = this.k();
        if (!ff2.isInitialized()) {
            throw fh.newUninitializedMessageException((Message)ff2);
        }
        return ff2;
    }

    public ff k() {
        ff ff2 = new ff(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            ff2.e = this.b;
        } else {
            ff2.e = this.c.build();
        }
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            ff2.f = this.d;
        } else {
            ff2.f = this.e.build();
        }
        this.onBuilt();
        return ff2;
    }

    public fh l() {
        return (fh)super.clone();
    }

    public fh a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fh)super.setField(fieldDescriptor, object);
    }

    public fh a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fh)super.clearField(fieldDescriptor);
    }

    public fh a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fh)super.clearOneof(oneofDescriptor);
    }

    public fh a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fh)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fh b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fh)super.addRepeatedField(fieldDescriptor, object);
    }

    public fh a(Message message) {
        if (message instanceof ff) {
            return this.a((ff)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fh a(ff ff2) {
        if (ff2 == ff.k()) {
            return this;
        }
        if (this.c == null) {
            if (!ff2.e.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = ff2.e;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.t();
                    this.b.addAll(ff2.e);
                }
                this.onChanged();
            }
        } else if (!ff2.e.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = ff2.e;
                this.a &= 0xFFFFFFFE;
                this.c = ff.o() ? this.u() : null;
            } else {
                this.c.addAllMessages(ff2.e);
            }
        }
        if (this.e == null) {
            if (!ff2.f.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = ff2.f;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.v();
                    this.d.addAll(ff2.f);
                }
                this.onChanged();
            }
        } else if (!ff2.f.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = ff2.f;
                this.a &= 0xFFFFFFFD;
                this.e = ff.p() ? this.w() : null;
            } else {
                this.e.addAllMessages(ff2.f);
            }
        }
        this.b(ff.b(ff2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        int n;
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            return false;
        }
        for (n = 0; n < this.g(); ++n) {
            if (this.c(n).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public fh a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ff ff2 = null;
        try {
            ff2 = (ff)ff.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ff2 = (ff)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ff2 != null) {
                this.a(ff2);
            }
        }
        return this;
    }

    private void t() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<eY>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<eY> b() {
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
    public eY a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (eY)this.c.getMessage(n);
    }

    public fh a(int n, eY eY2) {
        if (this.c == null) {
            if (eY2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.set(n, eY2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)eY2);
        }
        return this;
    }

    public fh a(int n, fa fa2) {
        if (this.c == null) {
            this.t();
            this.b.set(n, fa2.y());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)fa2.y());
        }
        return this;
    }

    public fh a(eY eY2) {
        if (this.c == null) {
            if (eY2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.add(eY2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)eY2);
        }
        return this;
    }

    public fh b(int n, eY eY2) {
        if (this.c == null) {
            if (eY2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.b.add(n, eY2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)eY2);
        }
        return this;
    }

    public fh a(fa fa2) {
        if (this.c == null) {
            this.t();
            this.b.add(fa2.y());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)fa2.y());
        }
        return this;
    }

    public fh b(int n, fa fa2) {
        if (this.c == null) {
            this.t();
            this.b.add(n, fa2.y());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)fa2.y());
        }
        return this;
    }

    public fh a(Iterable<? extends eY> iterable) {
        if (this.c == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public fh m() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public fh e(int n) {
        if (this.c == null) {
            this.t();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public fa f(int n) {
        return (fa)this.u().getBuilder(n);
    }

    @Override
    public fb b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (fb)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fb> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public fa n() {
        return (fa)this.u().addBuilder((AbstractMessage)eY.z());
    }

    public fa g(int n) {
        return (fa)this.u().addBuilder(n, (AbstractMessage)eY.z());
    }

    public List<fa> o() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eY, fa, fb> u() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    private void v() {
        if ((this.a & 2) != 2) {
            this.d = new ArrayList<eY>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<eY> e() {
        if (this.e == null) {
            return Collections.unmodifiableList(this.d);
        }
        return this.e.getMessageList();
    }

    @Override
    public int g() {
        if (this.e == null) {
            return this.d.size();
        }
        return this.e.getCount();
    }

    @Override
    public eY c(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (eY)this.e.getMessage(n);
    }

    public fh c(int n, eY eY2) {
        if (this.e == null) {
            if (eY2 == null) {
                throw new NullPointerException();
            }
            this.v();
            this.d.set(n, eY2);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)eY2);
        }
        return this;
    }

    public fh c(int n, fa fa2) {
        if (this.e == null) {
            this.v();
            this.d.set(n, fa2.y());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)fa2.y());
        }
        return this;
    }

    public fh b(eY eY2) {
        if (this.e == null) {
            if (eY2 == null) {
                throw new NullPointerException();
            }
            this.v();
            this.d.add(eY2);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)eY2);
        }
        return this;
    }

    public fh d(int n, eY eY2) {
        if (this.e == null) {
            if (eY2 == null) {
                throw new NullPointerException();
            }
            this.v();
            this.d.add(n, eY2);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)eY2);
        }
        return this;
    }

    public fh b(fa fa2) {
        if (this.e == null) {
            this.v();
            this.d.add(fa2.y());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)fa2.y());
        }
        return this;
    }

    public fh d(int n, fa fa2) {
        if (this.e == null) {
            this.v();
            this.d.add(n, fa2.y());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)fa2.y());
        }
        return this;
    }

    public fh b(Iterable<? extends eY> iterable) {
        if (this.e == null) {
            this.v();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public fh p() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public fh h(int n) {
        if (this.e == null) {
            this.v();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public fa i(int n) {
        return (fa)this.w().getBuilder(n);
    }

    @Override
    public fb d(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (fb)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends fb> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public fa q() {
        return (fa)this.w().addBuilder((AbstractMessage)eY.z());
    }

    public fa j(int n) {
        return (fa)this.w().addBuilder(n, (AbstractMessage)eY.z());
    }

    public List<fa> r() {
        return this.w().getBuilderList();
    }

    private RepeatedFieldBuilderV3<eY, fa, fb> w() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final fh a(UnknownFieldSet unknownFieldSet) {
        return (fh)super.setUnknownFields(unknownFieldSet);
    }

    public final fh b(UnknownFieldSet unknownFieldSet) {
        return (fh)super.mergeUnknownFields(unknownFieldSet);
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
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
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
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
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
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

