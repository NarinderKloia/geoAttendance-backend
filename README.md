# Geo Attendance API

Spring Boot backend for the existing Flutter attendance app, room geofencing, Bluetooth beacons, and education administration.

## Run locally

1. Create a MySQL user/database or keep the default `root` / `root` credentials.
2. Set `DB_URL`, `DB_USERNAME`, and `DB_PASSWORD` if your MySQL setup differs.
3. Run `./mvnw.cmd spring-boot:run` on Windows.
4. Browse `http://localhost:8080/admin/` for the admissions console and `http://localhost:8080/api` for API resources.

## Master-data APIs

Spring Data REST exposes `GET`, `POST`, `PUT`, `PATCH`, and `DELETE` at `/api` for:

`students`, `teachers`, `programs`, `courses`, `sections`, `subjects`, `student-enrollments`, `teacher-subjects`, `teacher-roles`, `blocks`, `floors`, `rooms`, `beacons`, `room-beacons`, `timetables`, and `class-sessions`.

For relationship values, use the linked resource URI. For example, a course request can contain:

```json
{ "code": "BCA-101", "name": "BCA Semester 1", "program": "/api/programs/1" }
```

## Mark attendance

`POST /api/attendance/mark`

```json
{
  "studentId": 1,
  "classSessionId": 1,
  "latitude": 28.6139,
  "longitude": 77.2090,
  "beaconUuid": "550e8400-e29b-41d4-a716-446655440000",
  "beaconMajor": 1,
  "beaconMinor": 3,
  "faceVerificationToken": "token returned by /api/face-verifications"
}
```

Face registration and verification intentionally stay in the existing Flutter/AWS API Gateway flow. The backend does not duplicate or replace that working implementation.

## Production requirements

The mobile compatibility endpoints preserve Flutter's response envelopes: `/api/students`, `/api/studentlogin`, `/api/getBlocks`, `/api/getFloors`, `/api/flatplotstatus`, and `/api/flatplots/{id}`. Point the Flutter base URL to this backend when you deploy it.

Add Spring Security/JWT before exposing these APIs publicly. In particular, restrict attendance marking to the authenticated student and restrict master-data changes to admin staff.
