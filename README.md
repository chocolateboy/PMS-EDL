# PMS-EDL

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [Synopsis](#synopsis)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Uninstalling](#uninstalling)
- [Upgrading](#upgrading)
- [Usage](#usage)
  - [Per-file](#per-file)
  - [Per-folder](#per-folder)
- [Building](#building)
- [Troubleshooting and Support](#troubleshooting-and-support)
- [Version](#version)
- [License](#license)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# Synopsis

This is a plugin for [PS3 Media Server](https://github.com/ps3mediaserver/ps3mediaserver) which adds support for MEncoder edit decision lists (EDLs). For information on creating EDL files, see [here](http://www.mplayerhq.hu/DOCS/HTML/en/edl.html).

# Prerequisites

This plugin should work on all platforms supported by PS3 Media Server.

These instructions assume you have the [latest version](http://www.ps3mediaserver.org/forum/viewtopic.php?f=6&t=3507&p=36904#p36904) of PS3 Media Server (PMS) and the [latest version](http://www.java.com/en/download/index.jsp) of Java.

EDLs require MEncoder, so if it is not being used automatically, it will need to be invoked via the `#--TRANSCODE--#` folder.

# Installation

* stop PMS
* download and save the [plugin](https://github.com/downloads/chocolateboy/PMS-EDL/pms-edl-1.1.0.jar) to the PMS `plugins` directory
* restart PMS

# Uninstalling

* stop PMS
* remove the jar file from the `plugins` directory
* restart PMS

# Upgrading

* stop PMS
* replace the old jar file with the new version
* restart PMS

# Usage

There are two ways to name an EDL: per-file and per-folder. Per-file EDLs take precedence over per-folder EDLs.

## Per-file

To create file-specific EDLs, place each `.edl` file in the same folder as the video it applies to. The .edl file must have the same filename as the video with an `.edl` extension appended e.g.

* Big Buck Bunny.mp4
* Big Buck Bunny.mp4.edl

## Per-folder

To create an EDL that applies to all videos in a folder, create a file called `folder.edl`.

* Episode 1x01.mp4
* Episode 1x02.mp4
* folder.edl

# Building

To build the plugin from source:

* install the latest version of [gradle](https://gradle.org/install/)
* create a subdirectory called `lib/` and add/symlink a recent (>= 1.30.1) `pms.jar` there
* run the default `jar` task by entering the command: `gradle`

The generated jar file can be found in `build/libs`.

# Troubleshooting and Support

* Check the PMS `debug.log`

# Version

1.1.0

# Author

[chocolateboy](mailto:chocolate@cpan.org)

# License

Copyright 2011-2018 by chocolateboy.

This is free software; you can redistribute it and/or modify it under the terms of the [Artistic License 2.0](https://www.opensource.org/licenses/artistic-license-2.0.php).
