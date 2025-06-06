/*
 * Copyright (C) 2023 FRIDAY Insurance S.A.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package de.friday.test.support;

import org.sonar.api.utils.Version;

public enum SonarServerVersionSupported {
    VERSION_25_1(Version.create(25, 1)),
    VERSION_25_2(Version.create(25, 2)),
    VERSION_25_3(Version.create(25, 3));

    private final Version version;

    SonarServerVersionSupported(Version version) {
        this.version = version;
    }

    public Version getVersion() {
        return version;
    }
}
