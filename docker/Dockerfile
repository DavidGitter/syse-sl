# author: Silas Jung

#img-date: 13.1.2024
FROM jenkins/jenkins:latest 

# get root permissions
USER root

# update image
RUN echo "Installing update..."
RUN apt update

# install ant
RUN echo "Installing ant..."
RUN apt install ant -y

# copy files to image
RUN echo "Copying OpenSCC to home"
RUN mkdir /home/scc
COPY ./scc/* /home/scc/

RUN echo "Copying junit jars to ant lib"
COPY ./junit/*.jar /usr/share/ant/lib


# set scc alias
RUN echo "alias scc='/home/scc/scc'" >> /root/.bashrc
RUN alias scc="/home/scc/scc"

